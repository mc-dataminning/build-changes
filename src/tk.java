import java.util.Arrays;
import java.util.Collection;

public class tk {
   public static final tl a = tl.i();
   public static final tl b = tl.c("options.on");
   public static final tl c = tl.c("options.off");
   public static final tl d = tl.c("gui.done");
   public static final tl e = tl.c("gui.cancel");
   public static final tl f = tl.c("gui.yes");
   public static final tl g = tl.c("gui.no");
   public static final tl h = tl.c("gui.ok");
   public static final tl i = tl.c("gui.proceed");
   public static final tl j = tl.c("gui.continue");
   public static final tl k = tl.c("gui.back");
   public static final tl l = tl.c("gui.toTitle");
   public static final tl m = tl.c("gui.acknowledge");
   public static final tl n = tl.c("chat.link.open");
   public static final tl o = tl.c("gui.copy_link_to_clipboard");
   public static final tl p = tl.c("menu.disconnect");
   public static final tl q = tl.c("connect.failed");
   public static final tl r = tl.b("\n");
   public static final tl s = tl.b(". ");
   public static final tl t = tl.b("...");
   public static final tl u = a();

   public static tz a() {
      return tl.b(" ");
   }

   public static tz a(long $$0) {
      return tl.a("gui.days", $$0);
   }

   public static tz b(long $$0) {
      return tl.a("gui.hours", $$0);
   }

   public static tz c(long $$0) {
      return tl.a("gui.minutes", $$0);
   }

   public static tl a(boolean $$0) {
      return $$0 ? b : c;
   }

   public static tz a(tl $$0, boolean $$1) {
      return tl.a($$1 ? "options.on.composed" : "options.off.composed", $$0);
   }

   public static tz a(tl $$0, tl $$1) {
      return tl.a("options.generic_value", $$0, $$1);
   }

   public static tz a(tl... $$0) {
      tz $$1 = tl.i();

      for (int $$2 = 0; $$2 < $$0.length; $$2++) {
         $$1.b($$0[$$2]);
         if ($$2 != $$0.length - 1) {
            $$1.b(s);
         }
      }

      return $$1;
   }

   public static tl b(tl... $$0) {
      return a(Arrays.asList($$0));
   }

   public static tl a(Collection<? extends tl> $$0) {
      return to.a($$0, r);
   }
}
