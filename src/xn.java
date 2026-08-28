import java.util.Arrays;
import java.util.Collection;

public class xn {
   public static final xo a = xo.i();
   public static final xo b = xo.c("options.on");
   public static final xo c = xo.c("options.off");
   public static final xo d = xo.c("gui.done");
   public static final xo e = xo.c("gui.cancel");
   public static final xo f = xo.c("gui.yes");
   public static final xo g = xo.c("gui.no");
   public static final xo h = xo.c("gui.ok");
   public static final xo i = xo.c("gui.proceed");
   public static final xo j = xo.c("gui.continue");
   public static final xo k = xo.c("gui.back");
   public static final xo l = xo.c("gui.toTitle");
   public static final xo m = xo.c("gui.acknowledge");
   public static final xo n = xo.c("chat.link.open");
   public static final xo o = xo.c("gui.copy_link_to_clipboard");
   public static final xo p = xo.c("menu.disconnect");
   public static final xo q = xo.c("connect.failed.transfer");
   public static final xo r = xo.c("connect.failed");
   public static final xo s = xo.b("\n");
   public static final xo t = xo.b(". ");
   public static final xo u = xo.b("...");
   public static final xo v = a();

   public static yc a() {
      return xo.b(" ");
   }

   public static yc a(long $$0) {
      return xo.a("gui.days", $$0);
   }

   public static yc b(long $$0) {
      return xo.a("gui.hours", $$0);
   }

   public static yc c(long $$0) {
      return xo.a("gui.minutes", $$0);
   }

   public static xo a(boolean $$0) {
      return $$0 ? b : c;
   }

   public static yc a(xo $$0, boolean $$1) {
      return xo.a($$1 ? "options.on.composed" : "options.off.composed", $$0);
   }

   public static yc a(xo $$0, xo $$1) {
      return xo.a("options.generic_value", $$0, $$1);
   }

   public static yc a(xo... $$0) {
      yc $$1 = xo.i();

      for (int $$2 = 0; $$2 < $$0.length; $$2++) {
         $$1.b($$0[$$2]);
         if ($$2 != $$0.length - 1) {
            $$1.b(t);
         }
      }

      return $$1;
   }

   public static xo b(xo... $$0) {
      return a(Arrays.asList($$0));
   }

   public static xo a(Collection<? extends xo> $$0) {
      return xr.a($$0, s);
   }
}
