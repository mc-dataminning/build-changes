import java.util.Arrays;
import java.util.Collection;

public class wn {
   public static final wo a = wo.i();
   public static final wo b = wo.c("options.on");
   public static final wo c = wo.c("options.off");
   public static final wo d = wo.c("gui.done");
   public static final wo e = wo.c("gui.cancel");
   public static final wo f = wo.c("gui.yes");
   public static final wo g = wo.c("gui.no");
   public static final wo h = wo.c("gui.ok");
   public static final wo i = wo.c("gui.proceed");
   public static final wo j = wo.c("gui.continue");
   public static final wo k = wo.c("gui.back");
   public static final wo l = wo.c("gui.toTitle");
   public static final wo m = wo.c("gui.acknowledge");
   public static final wo n = wo.c("chat.link.open");
   public static final wo o = wo.c("gui.copy_link_to_clipboard");
   public static final wo p = wo.c("menu.disconnect");
   public static final wo q = wo.c("connect.failed.transfer");
   public static final wo r = wo.c("connect.failed");
   public static final wo s = wo.b("\n");
   public static final wo t = wo.b(". ");
   public static final wo u = wo.b("...");
   public static final wo v = a();

   public static xc a() {
      return wo.b(" ");
   }

   public static xc a(long $$0) {
      return wo.a("gui.days", $$0);
   }

   public static xc b(long $$0) {
      return wo.a("gui.hours", $$0);
   }

   public static xc c(long $$0) {
      return wo.a("gui.minutes", $$0);
   }

   public static wo a(boolean $$0) {
      return $$0 ? b : c;
   }

   public static xc a(wo $$0, boolean $$1) {
      return wo.a($$1 ? "options.on.composed" : "options.off.composed", $$0);
   }

   public static xc a(wo $$0, wo $$1) {
      return wo.a("options.generic_value", $$0, $$1);
   }

   public static xc a(wo... $$0) {
      xc $$1 = wo.i();

      for (int $$2 = 0; $$2 < $$0.length; $$2++) {
         $$1.b($$0[$$2]);
         if ($$2 != $$0.length - 1) {
            $$1.b(t);
         }
      }

      return $$1;
   }

   public static wo b(wo... $$0) {
      return a(Arrays.asList($$0));
   }

   public static wo a(Collection<? extends wo> $$0) {
      return wr.a($$0, s);
   }
}
