package net.minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public class CrashReportCategory {
   private final String title;
   private final List<CrashReportCategory.Entry> entries = new ArrayList<>();
   private StackTraceElement[] stackTrace = new StackTraceElement[0];

   public CrashReportCategory(final String title) {
      this.title = title;
   }

   public CrashReportCategory setDetail(final String key, final CrashReportDetail<String> callback) {
      try {
         this.setDetail(key, callback.call());
      } catch (Throwable t) {
         this.setDetailError(key, t);
      }

      return this;
   }

   public CrashReportCategory setDetail(final String key, final @Nullable Object value) {
      this.entries.add(new CrashReportCategory.Entry(key, value));
      return this;
   }

   public void setDetailError(final String key, final Throwable t) {
      this.setDetail(key, t);
   }

   public int fillInStackTrace(final int nestedOffset) {
      StackTraceElement[] full = Thread.currentThread().getStackTrace();
      if (full.length <= 0) {
         return 0;
      }

      this.stackTrace = new StackTraceElement[full.length - 3 - nestedOffset];
      System.arraycopy(full, 3 + nestedOffset, this.stackTrace, 0, this.stackTrace.length);
      return this.stackTrace.length;
   }

   public boolean validateStackTrace(final @Nullable StackTraceElement source, final @Nullable StackTraceElement next) {
      if (this.stackTrace.length != 0 && source != null) {
         StackTraceElement current = this.stackTrace[0];
         if (current.isNativeMethod() == source.isNativeMethod()
            && Objects.equals(current.getClassName(), source.getClassName())
            && Objects.equals(current.getFileName(), source.getFileName())
            && Objects.equals(current.getMethodName(), source.getMethodName())) {
            if (next != null != this.stackTrace.length > 1) {
               return false;
            }

            if (next != null && !this.stackTrace[1].equals(next)) {
               return false;
            }

            this.stackTrace[0] = source;
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public void getDetails(final StringBuilder builder) {
      builder.append("-- ").append(this.title).append(" --\n");
      builder.append("Details:");

      for (CrashReportCategory.Entry entry : this.entries) {
         builder.append("\n\t");
         builder.append(entry.key());
         builder.append(": ");
         builder.append(entry.value());
      }

      if (this.stackTrace.length > 0) {
         builder.append("\nStacktrace:");

         for (StackTraceElement element : this.stackTrace) {
            builder.append("\n\tat ");
            builder.append(element);
         }
      }
   }

   public StackTraceElement[] getStacktrace() {
      return this.stackTrace;
   }

   public record Entry(String key, String value) {
      public Entry(final String key, final @Nullable Object rawValue) {
         String value;
         if (rawValue == null) {
            value = "~~NULL~~";
         } else if (rawValue instanceof Throwable t) {
            value = "~~ERROR~~ " + t.getClass().getSimpleName() + ": " + t.getMessage();
         } else {
            value = rawValue.toString();
         }

         this(key, value);
      }
   }
}
