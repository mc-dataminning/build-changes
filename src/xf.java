import java.util.Arrays;
import java.util.Collection;

public class xf {
   public static final xg a = xg.i();
   public static final xg b = xg.c("options.on");
   public static final xg c = xg.c("options.off");
   public static final xg d = xg.c("gui.done");
   public static final xg e = xg.c("gui.cancel");
   public static final xg f = xg.c("gui.yes");
   public static final xg g = xg.c("gui.no");
   public static final xg h = xg.c("gui.ok");
   public static final xg i = xg.c("gui.proceed");
   public static final xg j = xg.c("gui.continue");
   public static final xg k = xg.c("gui.back");
   public static final xg l = xg.c("gui.toTitle");
   public static final xg m = xg.c("gui.acknowledge");
   public static final xg n = xg.c("chat.link.open");
   public static final xg o = xg.c("gui.copy_link_to_clipboard");
   public static final xg p = xg.c("menu.disconnect");
   public static final xg q = xg.c("connect.failed.transfer");
   public static final xg r = xg.c("connect.failed");
   public static final xg s = xg.b("\n");
   public static final xg t = xg.b(". ");
   public static final xg u = xg.b("...");
   public static final xg v = a();

   public static xu a() {
      return xg.b(" ");
   }

   public static xu a(long $$0) {
      return xg.a("gui.days", $$0);
   }

   public static xu b(long $$0) {
      return xg.a("gui.hours", $$0);
   }

   public static xu c(long $$0) {
      return xg.a("gui.minutes", $$0);
   }

   public static xg a(boolean $$0) {
      return $$0 ? b : c;
   }

   public static xu a(xg $$0, boolean $$1) {
      return xg.a($$1 ? "options.on.composed" : "options.off.composed", $$0);
   }

   public static xu a(xg $$0, xg $$1) {
      return xg.a("options.generic_value", $$0, $$1);
   }

   public static xu a(xg... $$0) {
      xu $$1 = xg.i();

      for (int $$2 = 0; $$2 < $$0.length; $$2++) {
         $$1.b($$0[$$2]);
         if ($$2 != $$0.length - 1) {
            $$1.b(t);
         }
      }

      return $$1;
   }

   public static xg b(xg... $$0) {
      return a(Arrays.asList($$0));
   }

   public static xg a(Collection<? extends xg> $$0) {
      return xj.a($$0, s);
   }
}
