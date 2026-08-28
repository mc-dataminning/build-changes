import java.util.Arrays;
import java.util.Collection;

public class wy {
   public static final wz a = wz.i();
   public static final wz b = wz.c("options.on");
   public static final wz c = wz.c("options.off");
   public static final wz d = wz.c("gui.done");
   public static final wz e = wz.c("gui.cancel");
   public static final wz f = wz.c("gui.yes");
   public static final wz g = wz.c("gui.no");
   public static final wz h = wz.c("gui.ok");
   public static final wz i = wz.c("gui.proceed");
   public static final wz j = wz.c("gui.continue");
   public static final wz k = wz.c("gui.back");
   public static final wz l = wz.c("gui.toTitle");
   public static final wz m = wz.c("gui.acknowledge");
   public static final wz n = wz.c("chat.link.open");
   public static final wz o = wz.c("gui.copy_link_to_clipboard");
   public static final wz p = wz.c("menu.disconnect");
   public static final wz q = wz.c("connect.failed.transfer");
   public static final wz r = wz.c("connect.failed");
   public static final wz s = wz.b("\n");
   public static final wz t = wz.b(". ");
   public static final wz u = wz.b("...");
   public static final wz v = a();

   public static xn a() {
      return wz.b(" ");
   }

   public static xn a(long $$0) {
      return wz.a("gui.days", $$0);
   }

   public static xn b(long $$0) {
      return wz.a("gui.hours", $$0);
   }

   public static xn c(long $$0) {
      return wz.a("gui.minutes", $$0);
   }

   public static wz a(boolean $$0) {
      return $$0 ? b : c;
   }

   public static xn a(wz $$0, boolean $$1) {
      return wz.a($$1 ? "options.on.composed" : "options.off.composed", $$0);
   }

   public static xn a(wz $$0, wz $$1) {
      return wz.a("options.generic_value", $$0, $$1);
   }

   public static xn a(wz... $$0) {
      xn $$1 = wz.i();

      for (int $$2 = 0; $$2 < $$0.length; $$2++) {
         $$1.b($$0[$$2]);
         if ($$2 != $$0.length - 1) {
            $$1.b(t);
         }
      }

      return $$1;
   }

   public static wz b(wz... $$0) {
      return a(Arrays.asList($$0));
   }

   public static wz a(Collection<? extends wz> $$0) {
      return xc.a($$0, s);
   }
}
