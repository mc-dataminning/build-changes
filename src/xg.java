import java.util.Arrays;
import java.util.Collection;

public class xg {
   public static final xh a = xh.i();
   public static final xh b = xh.c("options.on");
   public static final xh c = xh.c("options.off");
   public static final xh d = xh.c("gui.done");
   public static final xh e = xh.c("gui.cancel");
   public static final xh f = xh.c("gui.yes");
   public static final xh g = xh.c("gui.no");
   public static final xh h = xh.c("gui.ok");
   public static final xh i = xh.c("gui.proceed");
   public static final xh j = xh.c("gui.continue");
   public static final xh k = xh.c("gui.back");
   public static final xh l = xh.c("gui.toTitle");
   public static final xh m = xh.c("gui.acknowledge");
   public static final xh n = xh.c("chat.link.open");
   public static final xh o = xh.c("gui.copy_link_to_clipboard");
   public static final xh p = xh.c("menu.disconnect");
   public static final xh q = xh.c("connect.failed.transfer");
   public static final xh r = xh.c("connect.failed");
   public static final xh s = xh.b("\n");
   public static final xh t = xh.b(". ");
   public static final xh u = xh.b("...");
   public static final xh v = a();

   public static xv a() {
      return xh.b(" ");
   }

   public static xv a(long $$0) {
      return xh.a("gui.days", $$0);
   }

   public static xv b(long $$0) {
      return xh.a("gui.hours", $$0);
   }

   public static xv c(long $$0) {
      return xh.a("gui.minutes", $$0);
   }

   public static xh a(boolean $$0) {
      return $$0 ? b : c;
   }

   public static xv a(xh $$0, boolean $$1) {
      return xh.a($$1 ? "options.on.composed" : "options.off.composed", $$0);
   }

   public static xv a(xh $$0, xh $$1) {
      return xh.a("options.generic_value", $$0, $$1);
   }

   public static xv a(xh... $$0) {
      xv $$1 = xh.i();

      for (int $$2 = 0; $$2 < $$0.length; $$2++) {
         $$1.b($$0[$$2]);
         if ($$2 != $$0.length - 1) {
            $$1.b(t);
         }
      }

      return $$1;
   }

   public static xh b(xh... $$0) {
      return a(Arrays.asList($$0));
   }

   public static xh a(Collection<? extends xh> $$0) {
      return xk.a($$0, s);
   }
}
