
Canvas.android28_9.0.0.class

package android.graphics;

import android.graphics.PorterDuff;
import android.graphics.Region;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
/* loaded from: Canvas.android28_9.0.0.class */
public class Canvas {
    public static final int ALL_SAVE_FLAG = 31;

    public Canvas() {
        throw new RuntimeException("Stub!");
    }

    public Canvas(@RecentlyNonNull Bitmap bitmap) {
        throw new RuntimeException("Stub!");
    }

    public boolean isHardwareAccelerated() {
        throw new RuntimeException("Stub!");
    }

    public void setBitmap(@RecentlyNullable Bitmap bitmap) {
        throw new RuntimeException("Stub!");
    }

    public boolean isOpaque() {
        throw new RuntimeException("Stub!");
    }

    public int getWidth() {
        throw new RuntimeException("Stub!");
    }

    public int getHeight() {
        throw new RuntimeException("Stub!");
    }

    public int getDensity() {
        throw new RuntimeException("Stub!");
    }

    public void setDensity(int density) {
        throw new RuntimeException("Stub!");
    }

    public int getMaximumBitmapWidth() {
        throw new RuntimeException("Stub!");
    }

    public int getMaximumBitmapHeight() {
        throw new RuntimeException("Stub!");
    }

    public int save() {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public int saveLayer(@RecentlyNullable RectF bounds, @RecentlyNullable Paint paint, int saveFlags) {
        throw new RuntimeException("Stub!");
    }

    public int saveLayer(@RecentlyNullable RectF bounds, @RecentlyNullable Paint paint) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public int saveLayer(float left, float top, float right, float bottom, @RecentlyNullable Paint paint, int saveFlags) {
        throw new RuntimeException("Stub!");
    }

    public int saveLayer(float left, float top, float right, float bottom, @RecentlyNullable Paint paint) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public int saveLayerAlpha(@RecentlyNullable RectF bounds, int alpha, int saveFlags) {
        throw new RuntimeException("Stub!");
    }

    public int saveLayerAlpha(@RecentlyNullable RectF bounds, int alpha) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public int saveLayerAlpha(float left, float top, float right, float bottom, int alpha, int saveFlags) {
        throw new RuntimeException("Stub!");
    }

    public int saveLayerAlpha(float left, float top, float right, float bottom, int alpha) {
        throw new RuntimeException("Stub!");
    }

    public void restore() {
        throw new RuntimeException("Stub!");
    }

    public int getSaveCount() {
        throw new RuntimeException("Stub!");
    }

    public void restoreToCount(int saveCount) {
        throw new RuntimeException("Stub!");
    }

    public void translate(float dx, float dy) {
        throw new RuntimeException("Stub!");
    }

    public void scale(float sx, float sy) {
        throw new RuntimeException("Stub!");
    }

    public final void scale(float sx, float sy, float px, float py) {
        throw new RuntimeException("Stub!");
    }

    public void rotate(float degrees) {
        throw new RuntimeException("Stub!");
    }

    public final void rotate(float degrees, float px, float py) {
        throw new RuntimeException("Stub!");
    }

    public void skew(float sx, float sy) {
        throw new RuntimeException("Stub!");
    }

    public void concat(@RecentlyNullable Matrix matrix) {
        throw new RuntimeException("Stub!");
    }

    public void setMatrix(@RecentlyNullable Matrix matrix) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public void getMatrix(@RecentlyNonNull Matrix ctm) {
        throw new RuntimeException("Stub!");
    }

    @RecentlyNonNull
    @Deprecated
    public final Matrix getMatrix() {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public boolean clipRect(@RecentlyNonNull RectF rect, @RecentlyNonNull Region.Op op) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public boolean clipRect(@RecentlyNonNull Rect rect, @RecentlyNonNull Region.Op op) {
        throw new RuntimeException("Stub!");
    }

    public boolean clipRect(@RecentlyNonNull RectF rect) {
        throw new RuntimeException("Stub!");
    }

    public boolean clipOutRect(@RecentlyNonNull RectF rect) {
        throw new RuntimeException("Stub!");
    }

    public boolean clipRect(@RecentlyNonNull Rect rect) {
        throw new RuntimeException("Stub!");
    }

    public boolean clipOutRect(@RecentlyNonNull Rect rect) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public boolean clipRect(float left, float top, float right, float bottom, @RecentlyNonNull Region.Op op) {
        throw new RuntimeException("Stub!");
    }

    public boolean clipRect(float left, float top, float right, float bottom) {
        throw new RuntimeException("Stub!");
    }

    public boolean clipOutRect(float left, float top, float right, float bottom) {
        throw new RuntimeException("Stub!");
    }

    public boolean clipRect(int left, int top, int right, int bottom) {
        throw new RuntimeException("Stub!");
    }

    public boolean clipOutRect(int left, int top, int right, int bottom) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public boolean clipPath(@RecentlyNonNull Path path, @RecentlyNonNull Region.Op op) {
        throw new RuntimeException("Stub!");
    }

    public boolean clipPath(@RecentlyNonNull Path path) {
        throw new RuntimeException("Stub!");
    }

    public boolean clipOutPath(@RecentlyNonNull Path path) {
        throw new RuntimeException("Stub!");
    }

    @RecentlyNullable
    public DrawFilter getDrawFilter() {
        throw new RuntimeException("Stub!");
    }

    public void setDrawFilter(@RecentlyNullable DrawFilter filter) {
        throw new RuntimeException("Stub!");
    }

    public boolean quickReject(@RecentlyNonNull RectF rect, @RecentlyNonNull EdgeType type) {
        throw new RuntimeException("Stub!");
    }

    public boolean quickReject(@RecentlyNonNull Path path, @RecentlyNonNull EdgeType type) {
        throw new RuntimeException("Stub!");
    }

    public boolean quickReject(float left, float top, float right, float bottom, @RecentlyNonNull EdgeType type) {
        throw new RuntimeException("Stub!");
    }

    public boolean getClipBounds(@RecentlyNullable Rect bounds) {
        throw new RuntimeException("Stub!");
    }

    @RecentlyNonNull
    public final Rect getClipBounds() {
        throw new RuntimeException("Stub!");
    }

    public void drawPicture(@RecentlyNonNull Picture picture) {
        throw new RuntimeException("Stub!");
    }

    public void drawPicture(@RecentlyNonNull Picture picture, @RecentlyNonNull RectF dst) {
        throw new RuntimeException("Stub!");
    }

    public void drawPicture(@RecentlyNonNull Picture picture, @RecentlyNonNull Rect dst) {
        throw new RuntimeException("Stub!");
    }

    public void drawArc(@RecentlyNonNull RectF oval, float startAngle, float sweepAngle, boolean useCenter, @RecentlyNonNull Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawArc(float left, float top, float right, float bottom, float startAngle, float sweepAngle, boolean useCenter, @RecentlyNonNull Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawARGB(int a, int r, int g, int b) {
        throw new RuntimeException("Stub!");
    }

    public void drawBitmap(@RecentlyNonNull Bitmap bitmap, float left, float top, @RecentlyNullable Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawBitmap(@RecentlyNonNull Bitmap bitmap, @RecentlyNullable Rect src, @RecentlyNonNull RectF dst, @RecentlyNullable Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawBitmap(@RecentlyNonNull Bitmap bitmap, @RecentlyNullable Rect src, @RecentlyNonNull Rect dst, @RecentlyNullable Paint paint) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public void drawBitmap(@RecentlyNonNull int[] colors, int offset, int stride, float x, float y, int width, int height, boolean hasAlpha, @RecentlyNullable Paint paint) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public void drawBitmap(@RecentlyNonNull int[] colors, int offset, int stride, int x, int y, int width, int height, boolean hasAlpha, @RecentlyNullable Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawBitmap(@RecentlyNonNull Bitmap bitmap, @RecentlyNonNull Matrix matrix, @RecentlyNullable Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawBitmapMesh(@RecentlyNonNull Bitmap bitmap, int meshWidth, int meshHeight, @RecentlyNonNull float[] verts, int vertOffset, @RecentlyNullable int[] colors, int colorOffset, @RecentlyNullable Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawCircle(float cx, float cy, float radius, @RecentlyNonNull Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawColor(int color) {
        throw new RuntimeException("Stub!");
    }

    public void drawColor(int color, @RecentlyNonNull PorterDuff.Mode mode) {
        throw new RuntimeException("Stub!");
    }

    public void drawLine(float startX, float startY, float stopX, float stopY, @RecentlyNonNull Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawLines(@RecentlyNonNull float[] pts, int offset, int count, @RecentlyNonNull Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawLines(@RecentlyNonNull float[] pts, @RecentlyNonNull Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawOval(@RecentlyNonNull RectF oval, @RecentlyNonNull Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawOval(float left, float top, float right, float bottom, @RecentlyNonNull Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawPaint(@RecentlyNonNull Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawPath(@RecentlyNonNull Path path, @RecentlyNonNull Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawPoint(float x, float y, @RecentlyNonNull Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawPoints(float[] pts, int offset, int count, @RecentlyNonNull Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawPoints(@RecentlyNonNull float[] pts, @RecentlyNonNull Paint paint) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public void drawPosText(@RecentlyNonNull char[] text, int index, int count, @RecentlyNonNull float[] pos, @RecentlyNonNull Paint paint) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public void drawPosText(@RecentlyNonNull String text, @RecentlyNonNull float[] pos, @RecentlyNonNull Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawRect(@RecentlyNonNull RectF rect, @RecentlyNonNull Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawRect(@RecentlyNonNull Rect r, @RecentlyNonNull Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawRect(float left, float top, float right, float bottom, @RecentlyNonNull Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawRGB(int r, int g, int b) {
        throw new RuntimeException("Stub!");
    }

    public void drawRoundRect(@RecentlyNonNull RectF rect, float rx, float ry, @RecentlyNonNull Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawRoundRect(float left, float top, float right, float bottom, float rx, float ry, @RecentlyNonNull Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawText(@RecentlyNonNull char[] text, int index, int count, float x, float y, @RecentlyNonNull Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawText(@RecentlyNonNull String text, float x, float y, @RecentlyNonNull Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawText(@RecentlyNonNull String text, int start, int end, float x, float y, @RecentlyNonNull Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawText(@RecentlyNonNull CharSequence text, int start, int end, float x, float y, @RecentlyNonNull Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawTextOnPath(@RecentlyNonNull char[] text, int index, int count, @RecentlyNonNull Path path, float hOffset, float vOffset, @RecentlyNonNull Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawTextOnPath(@RecentlyNonNull String text, @RecentlyNonNull Path path, float hOffset, float vOffset, @RecentlyNonNull Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawTextRun(@RecentlyNonNull char[] text, int index, int count, int contextIndex, int contextCount, float x, float y, boolean isRtl, @RecentlyNonNull Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawTextRun(@RecentlyNonNull CharSequence text, int start, int end, int contextStart, int contextEnd, float x, float y, boolean isRtl, @RecentlyNonNull Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawVertices(@RecentlyNonNull VertexMode mode, int vertexCount, @RecentlyNonNull float[] verts, int vertOffset, @RecentlyNullable float[] texs, int texOffset, @RecentlyNullable int[] colors, int colorOffset, @RecentlyNullable short[] indices, int indexOffset, int indexCount, @RecentlyNonNull Paint paint) {
        throw new RuntimeException("Stub!");
    }
}
