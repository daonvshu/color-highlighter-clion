/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2019 Elior Boukhobza
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 *
 */

package com.mallowigi.search.parsers;

import com.mallowigi.utils.ColorUtils;
import org.jetbrains.annotations.NotNull;

import java.awt.*;

public final class HexColorParser implements ColorParser {
  private final int offset;

  HexColorParser(final boolean withHash) {
    offset = withHash ? 1 : 0;
  }

  @Override
  public Color parseColor(final String text) {
    return parseHex(text);
  }

  /**
   * parse a color in the hex format
   */
  @NotNull
  private Color parseHex(@NotNull final String text) {
    return text.length() == 3 + offset ?
           ColorUtils.getShortRGB(text.substring(offset)) :
           ColorUtils.getRGB(text.substring(offset));
  }

}
