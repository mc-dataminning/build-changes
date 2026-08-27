import java.util.Arrays;
import java.util.Collection;

public class td {
   public static final te a = te.h();
   public static final te b = te.c("options.on");
   public static final te c = te.c("options.off");
   public static final te d = te.c("gui.done");
   public static final te e = te.c("gui.cancel");
   public static final te f = te.c("gui.yes");
   public static final te g = te.c("gui.no");
   public static final te h = te.c("gui.ok");
   public static final te i = te.c("gui.proceed");
   public static final te j = te.c("gui.continue");
   public static final te k = te.c("gui.back");
   public static final te l = te.c("gui.toTitle");
   public static final te m = te.c("gui.acknowledge");
   public static final te n = te.c("chat.link.open");
   public static final te o = te.c("gui.copy_link_to_clipboard");
   public static final te p = te.c("menu.disconnect");
   public static final te q = te.c("connect.failed");
   public static final te r = te.b("\n");
   public static final te s = te.b(". ");
   public static final te t = te.b("...");
   public static final te u = a();

   public static tr a() {
      return te.b(" ");
   }

   public static tr a(long $$0) {
      return te.a("gui.days", $$0);
   }

   public static tr b(long $$0) {
      return te.a("gui.hours", $$0);
   }

   public static tr c(long $$0) {
      return te.a("gui.minutes", $$0);
   }

   public static te a(boolean $$0) {
      return $$0 ? b : c;
   }

   public static tr a(te $$0, boolean $$1) {
      return te.a($$1 ? "options.on.composed" : "options.off.composed", $$0);
   }

   public static tr a(te $$0, te $$1) {
      return te.a("options.generic_value", $$0, $$1);
   }

   public static tr a(te... $$0) {
      tr $$1 = te.h();

      for (int $$2 = 0; $$2 < $$0.length; $$2++) {
         $$1.b($$0[$$2]);
         if ($$2 != $$0.length - 1) {
            $$1.b(s);
         }
      }

      return $$1;
   }

   public static te b(te... $$0) {
      return a(Arrays.asList($$0));
   }

   public static te a(Collection<? extends te> $$0) {
      return tg.a($$0, r);
   }
}
