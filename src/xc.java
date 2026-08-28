import java.util.Arrays;
import java.util.Collection;

public class xc {
   public static final xd a = xd.i();
   public static final xd b = xd.c("options.on");
   public static final xd c = xd.c("options.off");
   public static final xd d = xd.c("gui.done");
   public static final xd e = xd.c("gui.cancel");
   public static final xd f = xd.c("gui.yes");
   public static final xd g = xd.c("gui.no");
   public static final xd h = xd.c("gui.ok");
   public static final xd i = xd.c("gui.proceed");
   public static final xd j = xd.c("gui.continue");
   public static final xd k = xd.c("gui.back");
   public static final xd l = xd.c("gui.toTitle");
   public static final xd m = xd.c("gui.acknowledge");
   public static final xd n = xd.c("chat.link.open");
   public static final xd o = xd.c("gui.copy_link_to_clipboard");
   public static final xd p = xd.c("menu.disconnect");
   public static final xd q = xd.c("connect.failed.transfer");
   public static final xd r = xd.c("connect.failed");
   public static final xd s = xd.b("\n");
   public static final xd t = xd.b(". ");
   public static final xd u = xd.b("...");
   public static final xd v = a();

   public static xr a() {
      return xd.b(" ");
   }

   public static xr a(long $$0) {
      return xd.a("gui.days", $$0);
   }

   public static xr b(long $$0) {
      return xd.a("gui.hours", $$0);
   }

   public static xr c(long $$0) {
      return xd.a("gui.minutes", $$0);
   }

   public static xd a(boolean $$0) {
      return $$0 ? b : c;
   }

   public static xr a(xd $$0, boolean $$1) {
      return xd.a($$1 ? "options.on.composed" : "options.off.composed", $$0);
   }

   public static xr a(xd $$0, xd $$1) {
      return xd.a("options.generic_value", $$0, $$1);
   }

   public static xr a(xd... $$0) {
      xr $$1 = xd.i();

      for (int $$2 = 0; $$2 < $$0.length; $$2++) {
         $$1.b($$0[$$2]);
         if ($$2 != $$0.length - 1) {
            $$1.b(t);
         }
      }

      return $$1;
   }

   public static xd b(xd... $$0) {
      return a(Arrays.asList($$0));
   }

   public static xd a(Collection<? extends xd> $$0) {
      return xg.a($$0, s);
   }
}
