import java.util.Arrays;
import java.util.Collection;

public class tl {
   public static final tm a = tm.h();
   public static final tm b = tm.c("options.on");
   public static final tm c = tm.c("options.off");
   public static final tm d = tm.c("gui.done");
   public static final tm e = tm.c("gui.cancel");
   public static final tm f = tm.c("gui.yes");
   public static final tm g = tm.c("gui.no");
   public static final tm h = tm.c("gui.ok");
   public static final tm i = tm.c("gui.proceed");
   public static final tm j = tm.c("gui.continue");
   public static final tm k = tm.c("gui.back");
   public static final tm l = tm.c("gui.toTitle");
   public static final tm m = tm.c("gui.acknowledge");
   public static final tm n = tm.c("chat.link.open");
   public static final tm o = tm.c("gui.copy_link_to_clipboard");
   public static final tm p = tm.c("menu.disconnect");
   public static final tm q = tm.c("connect.failed");
   public static final tm r = tm.b("\n");
   public static final tm s = tm.b(". ");
   public static final tm t = tm.b("...");
   public static final tm u = a();

   public static tz a() {
      return tm.b(" ");
   }

   public static tz a(long $$0) {
      return tm.a("gui.days", $$0);
   }

   public static tz b(long $$0) {
      return tm.a("gui.hours", $$0);
   }

   public static tz c(long $$0) {
      return tm.a("gui.minutes", $$0);
   }

   public static tm a(boolean $$0) {
      return $$0 ? b : c;
   }

   public static tz a(tm $$0, boolean $$1) {
      return tm.a($$1 ? "options.on.composed" : "options.off.composed", $$0);
   }

   public static tz a(tm $$0, tm $$1) {
      return tm.a("options.generic_value", $$0, $$1);
   }

   public static tz a(tm... $$0) {
      tz $$1 = tm.h();

      for (int $$2 = 0; $$2 < $$0.length; $$2++) {
         $$1.b($$0[$$2]);
         if ($$2 != $$0.length - 1) {
            $$1.b(s);
         }
      }

      return $$1;
   }

   public static tm b(tm... $$0) {
      return a(Arrays.asList($$0));
   }

   public static tm a(Collection<? extends tm> $$0) {
      return to.a($$0, r);
   }
}
