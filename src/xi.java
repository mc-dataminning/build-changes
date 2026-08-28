import java.util.Arrays;
import java.util.Collection;

public class xi {
   public static final xj a = xj.i();
   public static final xj b = xj.c("options.on");
   public static final xj c = xj.c("options.off");
   public static final xj d = xj.c("gui.done");
   public static final xj e = xj.c("gui.cancel");
   public static final xj f = xj.c("gui.yes");
   public static final xj g = xj.c("gui.no");
   public static final xj h = xj.c("gui.ok");
   public static final xj i = xj.c("gui.proceed");
   public static final xj j = xj.c("gui.continue");
   public static final xj k = xj.c("gui.back");
   public static final xj l = xj.c("gui.toTitle");
   public static final xj m = xj.c("gui.acknowledge");
   public static final xj n = xj.c("chat.link.open");
   public static final xj o = xj.c("gui.copy_link_to_clipboard");
   public static final xj p = xj.c("menu.disconnect");
   public static final xj q = xj.c("connect.failed.transfer");
   public static final xj r = xj.c("connect.failed");
   public static final xj s = xj.b("\n");
   public static final xj t = xj.b(". ");
   public static final xj u = xj.b("...");
   public static final xj v = a();

   public static xx a() {
      return xj.b(" ");
   }

   public static xx a(long $$0) {
      return xj.a("gui.days", $$0);
   }

   public static xx b(long $$0) {
      return xj.a("gui.hours", $$0);
   }

   public static xx c(long $$0) {
      return xj.a("gui.minutes", $$0);
   }

   public static xj a(boolean $$0) {
      return $$0 ? b : c;
   }

   public static xx a(xj $$0, boolean $$1) {
      return xj.a($$1 ? "options.on.composed" : "options.off.composed", $$0);
   }

   public static xx a(xj $$0, xj $$1) {
      return xj.a("options.generic_value", $$0, $$1);
   }

   public static xx a(xj... $$0) {
      xx $$1 = xj.i();

      for (int $$2 = 0; $$2 < $$0.length; $$2++) {
         $$1.b($$0[$$2]);
         if ($$2 != $$0.length - 1) {
            $$1.b(t);
         }
      }

      return $$1;
   }

   public static xj b(xj... $$0) {
      return a(Arrays.asList($$0));
   }

   public static xj a(Collection<? extends xj> $$0) {
      return xm.a($$0, s);
   }
}
