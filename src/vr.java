import java.util.Arrays;
import java.util.Collection;

public class vr {
   public static final vs a = vs.i();
   public static final vs b = vs.c("options.on");
   public static final vs c = vs.c("options.off");
   public static final vs d = vs.c("gui.done");
   public static final vs e = vs.c("gui.cancel");
   public static final vs f = vs.c("gui.yes");
   public static final vs g = vs.c("gui.no");
   public static final vs h = vs.c("gui.ok");
   public static final vs i = vs.c("gui.proceed");
   public static final vs j = vs.c("gui.continue");
   public static final vs k = vs.c("gui.back");
   public static final vs l = vs.c("gui.toTitle");
   public static final vs m = vs.c("gui.acknowledge");
   public static final vs n = vs.c("chat.link.open");
   public static final vs o = vs.c("gui.copy_link_to_clipboard");
   public static final vs p = vs.c("menu.disconnect");
   public static final vs q = vs.c("connect.failed.transfer");
   public static final vs r = vs.c("connect.failed");
   public static final vs s = vs.b("\n");
   public static final vs t = vs.b(". ");
   public static final vs u = vs.b("...");
   public static final vs v = a();

   public static wg a() {
      return vs.b(" ");
   }

   public static wg a(long $$0) {
      return vs.a("gui.days", $$0);
   }

   public static wg b(long $$0) {
      return vs.a("gui.hours", $$0);
   }

   public static wg c(long $$0) {
      return vs.a("gui.minutes", $$0);
   }

   public static vs a(boolean $$0) {
      return $$0 ? b : c;
   }

   public static wg a(vs $$0, boolean $$1) {
      return vs.a($$1 ? "options.on.composed" : "options.off.composed", $$0);
   }

   public static wg a(vs $$0, vs $$1) {
      return vs.a("options.generic_value", $$0, $$1);
   }

   public static wg a(vs... $$0) {
      wg $$1 = vs.i();

      for (int $$2 = 0; $$2 < $$0.length; $$2++) {
         $$1.b($$0[$$2]);
         if ($$2 != $$0.length - 1) {
            $$1.b(t);
         }
      }

      return $$1;
   }

   public static vs b(vs... $$0) {
      return a(Arrays.asList($$0));
   }

   public static vs a(Collection<? extends vs> $$0) {
      return vv.a($$0, s);
   }
}
