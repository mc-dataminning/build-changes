import java.util.Arrays;
import java.util.Collection;

public class wf {
   public static final wg a = wg.i();
   public static final wg b = wg.c("options.on");
   public static final wg c = wg.c("options.off");
   public static final wg d = wg.c("gui.done");
   public static final wg e = wg.c("gui.cancel");
   public static final wg f = wg.c("gui.yes");
   public static final wg g = wg.c("gui.no");
   public static final wg h = wg.c("gui.ok");
   public static final wg i = wg.c("gui.proceed");
   public static final wg j = wg.c("gui.continue");
   public static final wg k = wg.c("gui.back");
   public static final wg l = wg.c("gui.toTitle");
   public static final wg m = wg.c("gui.acknowledge");
   public static final wg n = wg.c("chat.link.open");
   public static final wg o = wg.c("gui.copy_link_to_clipboard");
   public static final wg p = wg.c("menu.disconnect");
   public static final wg q = wg.c("connect.failed.transfer");
   public static final wg r = wg.c("connect.failed");
   public static final wg s = wg.b("\n");
   public static final wg t = wg.b(". ");
   public static final wg u = wg.b("...");
   public static final wg v = a();

   public static wu a() {
      return wg.b(" ");
   }

   public static wu a(long $$0) {
      return wg.a("gui.days", $$0);
   }

   public static wu b(long $$0) {
      return wg.a("gui.hours", $$0);
   }

   public static wu c(long $$0) {
      return wg.a("gui.minutes", $$0);
   }

   public static wg a(boolean $$0) {
      return $$0 ? b : c;
   }

   public static wu a(wg $$0, boolean $$1) {
      return wg.a($$1 ? "options.on.composed" : "options.off.composed", $$0);
   }

   public static wu a(wg $$0, wg $$1) {
      return wg.a("options.generic_value", $$0, $$1);
   }

   public static wu a(wg... $$0) {
      wu $$1 = wg.i();

      for (int $$2 = 0; $$2 < $$0.length; $$2++) {
         $$1.b($$0[$$2]);
         if ($$2 != $$0.length - 1) {
            $$1.b(t);
         }
      }

      return $$1;
   }

   public static wg b(wg... $$0) {
      return a(Arrays.asList($$0));
   }

   public static wg a(Collection<? extends wg> $$0) {
      return wj.a($$0, s);
   }
}
