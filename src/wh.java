import java.util.Arrays;
import java.util.Collection;

public class wh {
   public static final wi a = wi.i();
   public static final wi b = wi.c("options.on");
   public static final wi c = wi.c("options.off");
   public static final wi d = wi.c("gui.done");
   public static final wi e = wi.c("gui.cancel");
   public static final wi f = wi.c("gui.yes");
   public static final wi g = wi.c("gui.no");
   public static final wi h = wi.c("gui.ok");
   public static final wi i = wi.c("gui.proceed");
   public static final wi j = wi.c("gui.continue");
   public static final wi k = wi.c("gui.back");
   public static final wi l = wi.c("gui.toTitle");
   public static final wi m = wi.c("gui.acknowledge");
   public static final wi n = wi.c("chat.link.open");
   public static final wi o = wi.c("gui.copy_link_to_clipboard");
   public static final wi p = wi.c("menu.disconnect");
   public static final wi q = wi.c("connect.failed.transfer");
   public static final wi r = wi.c("connect.failed");
   public static final wi s = wi.b("\n");
   public static final wi t = wi.b(". ");
   public static final wi u = wi.b("...");
   public static final wi v = a();

   public static ww a() {
      return wi.b(" ");
   }

   public static ww a(long $$0) {
      return wi.a("gui.days", $$0);
   }

   public static ww b(long $$0) {
      return wi.a("gui.hours", $$0);
   }

   public static ww c(long $$0) {
      return wi.a("gui.minutes", $$0);
   }

   public static wi a(boolean $$0) {
      return $$0 ? b : c;
   }

   public static ww a(wi $$0, boolean $$1) {
      return wi.a($$1 ? "options.on.composed" : "options.off.composed", $$0);
   }

   public static ww a(wi $$0, wi $$1) {
      return wi.a("options.generic_value", $$0, $$1);
   }

   public static ww a(wi... $$0) {
      ww $$1 = wi.i();

      for (int $$2 = 0; $$2 < $$0.length; $$2++) {
         $$1.b($$0[$$2]);
         if ($$2 != $$0.length - 1) {
            $$1.b(t);
         }
      }

      return $$1;
   }

   public static wi b(wi... $$0) {
      return a(Arrays.asList($$0));
   }

   public static wi a(Collection<? extends wi> $$0) {
      return wl.a($$0, s);
   }
}
