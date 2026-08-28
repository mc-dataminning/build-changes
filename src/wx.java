import java.util.Arrays;
import java.util.Collection;

public class wx {
   public static final wy a = wy.i();
   public static final wy b = wy.c("options.on");
   public static final wy c = wy.c("options.off");
   public static final wy d = wy.c("gui.done");
   public static final wy e = wy.c("gui.cancel");
   public static final wy f = wy.c("gui.yes");
   public static final wy g = wy.c("gui.no");
   public static final wy h = wy.c("gui.ok");
   public static final wy i = wy.c("gui.proceed");
   public static final wy j = wy.c("gui.continue");
   public static final wy k = wy.c("gui.back");
   public static final wy l = wy.c("gui.toTitle");
   public static final wy m = wy.c("gui.acknowledge");
   public static final wy n = wy.c("chat.link.open");
   public static final wy o = wy.c("gui.copy_link_to_clipboard");
   public static final wy p = wy.c("menu.disconnect");
   public static final wy q = wy.c("connect.failed.transfer");
   public static final wy r = wy.c("connect.failed");
   public static final wy s = wy.b("\n");
   public static final wy t = wy.b(". ");
   public static final wy u = wy.b("...");
   public static final wy v = a();

   public static xm a() {
      return wy.b(" ");
   }

   public static xm a(long $$0) {
      return wy.a("gui.days", $$0);
   }

   public static xm b(long $$0) {
      return wy.a("gui.hours", $$0);
   }

   public static xm c(long $$0) {
      return wy.a("gui.minutes", $$0);
   }

   public static wy a(boolean $$0) {
      return $$0 ? b : c;
   }

   public static xm a(wy $$0, boolean $$1) {
      return wy.a($$1 ? "options.on.composed" : "options.off.composed", $$0);
   }

   public static xm a(wy $$0, wy $$1) {
      return wy.a("options.generic_value", $$0, $$1);
   }

   public static xm a(wy... $$0) {
      xm $$1 = wy.i();

      for (int $$2 = 0; $$2 < $$0.length; $$2++) {
         $$1.b($$0[$$2]);
         if ($$2 != $$0.length - 1) {
            $$1.b(t);
         }
      }

      return $$1;
   }

   public static wy b(wy... $$0) {
      return a(Arrays.asList($$0));
   }

   public static wy a(Collection<? extends wy> $$0) {
      return xb.a($$0, s);
   }
}
