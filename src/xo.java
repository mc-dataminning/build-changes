import java.util.Arrays;
import java.util.Collection;

public class xo {
   public static final xp a = xp.i();
   public static final xp b = xp.c("options.on");
   public static final xp c = xp.c("options.off");
   public static final xp d = xp.c("gui.done");
   public static final xp e = xp.c("gui.cancel");
   public static final xp f = xp.c("gui.yes");
   public static final xp g = xp.c("gui.no");
   public static final xp h = xp.c("gui.ok");
   public static final xp i = xp.c("gui.proceed");
   public static final xp j = xp.c("gui.continue");
   public static final xp k = xp.c("gui.back");
   public static final xp l = xp.c("gui.toTitle");
   public static final xp m = xp.c("gui.acknowledge");
   public static final xp n = xp.c("chat.link.open");
   public static final xp o = xp.c("gui.copy_link_to_clipboard");
   public static final xp p = xp.c("menu.disconnect");
   public static final xp q = xp.c("connect.failed.transfer");
   public static final xp r = xp.c("connect.failed");
   public static final xp s = xp.b("\n");
   public static final xp t = xp.b(". ");
   public static final xp u = xp.b("...");
   public static final xp v = a();

   public static yd a() {
      return xp.b(" ");
   }

   public static yd a(long $$0) {
      return xp.a("gui.days", $$0);
   }

   public static yd b(long $$0) {
      return xp.a("gui.hours", $$0);
   }

   public static yd c(long $$0) {
      return xp.a("gui.minutes", $$0);
   }

   public static xp a(boolean $$0) {
      return $$0 ? b : c;
   }

   public static yd a(xp $$0, boolean $$1) {
      return xp.a($$1 ? "options.on.composed" : "options.off.composed", $$0);
   }

   public static yd a(xp $$0, xp $$1) {
      return xp.a("options.generic_value", $$0, $$1);
   }

   public static yd a(xp... $$0) {
      yd $$1 = xp.i();

      for (int $$2 = 0; $$2 < $$0.length; $$2++) {
         $$1.b($$0[$$2]);
         if ($$2 != $$0.length - 1) {
            $$1.b(t);
         }
      }

      return $$1;
   }

   public static xp b(xp... $$0) {
      return a(Arrays.asList($$0));
   }

   public static xp a(Collection<? extends xp> $$0) {
      return xs.a($$0, s);
   }
}
