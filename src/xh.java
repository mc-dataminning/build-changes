import java.util.Arrays;
import java.util.Collection;

public class xh {
   public static final xi a = xi.i();
   public static final xi b = xi.c("options.on");
   public static final xi c = xi.c("options.off");
   public static final xi d = xi.c("gui.done");
   public static final xi e = xi.c("gui.cancel");
   public static final xi f = xi.c("gui.yes");
   public static final xi g = xi.c("gui.no");
   public static final xi h = xi.c("gui.ok");
   public static final xi i = xi.c("gui.proceed");
   public static final xi j = xi.c("gui.continue");
   public static final xi k = xi.c("gui.back");
   public static final xi l = xi.c("gui.toTitle");
   public static final xi m = xi.c("gui.acknowledge");
   public static final xi n = xi.c("chat.link.open");
   public static final xi o = xi.c("gui.copy_link_to_clipboard");
   public static final xi p = xi.c("menu.disconnect");
   public static final xi q = xi.c("connect.failed.transfer");
   public static final xi r = xi.c("connect.failed");
   public static final xi s = xi.b("\n");
   public static final xi t = xi.b(". ");
   public static final xi u = xi.b("...");
   public static final xi v = a();

   public static xw a() {
      return xi.b(" ");
   }

   public static xw a(long $$0) {
      return xi.a("gui.days", $$0);
   }

   public static xw b(long $$0) {
      return xi.a("gui.hours", $$0);
   }

   public static xw c(long $$0) {
      return xi.a("gui.minutes", $$0);
   }

   public static xi a(boolean $$0) {
      return $$0 ? b : c;
   }

   public static xw a(xi $$0, boolean $$1) {
      return xi.a($$1 ? "options.on.composed" : "options.off.composed", $$0);
   }

   public static xw a(xi $$0, xi $$1) {
      return xi.a("options.generic_value", $$0, $$1);
   }

   public static xw a(xi... $$0) {
      xw $$1 = xi.i();

      for (int $$2 = 0; $$2 < $$0.length; $$2++) {
         $$1.b($$0[$$2]);
         if ($$2 != $$0.length - 1) {
            $$1.b(t);
         }
      }

      return $$1;
   }

   public static xi b(xi... $$0) {
      return a(Arrays.asList($$0));
   }

   public static xi a(Collection<? extends xi> $$0) {
      return xl.a($$0, s);
   }
}
