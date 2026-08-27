import java.util.Arrays;
import java.util.Collection;

public class xd {
   public static final xe a = xe.i();
   public static final xe b = xe.c("options.on");
   public static final xe c = xe.c("options.off");
   public static final xe d = xe.c("gui.done");
   public static final xe e = xe.c("gui.cancel");
   public static final xe f = xe.c("gui.yes");
   public static final xe g = xe.c("gui.no");
   public static final xe h = xe.c("gui.ok");
   public static final xe i = xe.c("gui.proceed");
   public static final xe j = xe.c("gui.continue");
   public static final xe k = xe.c("gui.back");
   public static final xe l = xe.c("gui.toTitle");
   public static final xe m = xe.c("gui.acknowledge");
   public static final xe n = xe.c("chat.link.open");
   public static final xe o = xe.c("gui.copy_link_to_clipboard");
   public static final xe p = xe.c("menu.disconnect");
   public static final xe q = xe.c("connect.failed.transfer");
   public static final xe r = xe.c("connect.failed");
   public static final xe s = xe.b("\n");
   public static final xe t = xe.b(". ");
   public static final xe u = xe.b("...");
   public static final xe v = a();

   public static xs a() {
      return xe.b(" ");
   }

   public static xs a(long $$0) {
      return xe.a("gui.days", $$0);
   }

   public static xs b(long $$0) {
      return xe.a("gui.hours", $$0);
   }

   public static xs c(long $$0) {
      return xe.a("gui.minutes", $$0);
   }

   public static xe a(boolean $$0) {
      return $$0 ? b : c;
   }

   public static xs a(xe $$0, boolean $$1) {
      return xe.a($$1 ? "options.on.composed" : "options.off.composed", $$0);
   }

   public static xs a(xe $$0, xe $$1) {
      return xe.a("options.generic_value", $$0, $$1);
   }

   public static xs a(xe... $$0) {
      xs $$1 = xe.i();

      for (int $$2 = 0; $$2 < $$0.length; $$2++) {
         $$1.a($$0[$$2]);
         if ($$2 != $$0.length - 1) {
            $$1.a(t);
         }
      }

      return $$1;
   }

   public static xe b(xe... $$0) {
      return a(Arrays.asList($$0));
   }

   public static xe a(Collection<? extends xe> $$0) {
      return xh.a($$0, s);
   }
}
