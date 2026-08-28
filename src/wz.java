import java.util.Arrays;
import java.util.Collection;

public class wz {
   public static final xa a = xa.i();
   public static final xa b = xa.c("options.on");
   public static final xa c = xa.c("options.off");
   public static final xa d = xa.c("gui.done");
   public static final xa e = xa.c("gui.cancel");
   public static final xa f = xa.c("gui.yes");
   public static final xa g = xa.c("gui.no");
   public static final xa h = xa.c("gui.ok");
   public static final xa i = xa.c("gui.proceed");
   public static final xa j = xa.c("gui.continue");
   public static final xa k = xa.c("gui.back");
   public static final xa l = xa.c("gui.toTitle");
   public static final xa m = xa.c("gui.acknowledge");
   public static final xa n = xa.c("chat.link.open");
   public static final xa o = xa.c("gui.copy_link_to_clipboard");
   public static final xa p = xa.c("menu.disconnect");
   public static final xa q = xa.c("connect.failed.transfer");
   public static final xa r = xa.c("connect.failed");
   public static final xa s = xa.b("\n");
   public static final xa t = xa.b(". ");
   public static final xa u = xa.b("...");
   public static final xa v = a();

   public static xo a() {
      return xa.b(" ");
   }

   public static xo a(long $$0) {
      return xa.a("gui.days", $$0);
   }

   public static xo b(long $$0) {
      return xa.a("gui.hours", $$0);
   }

   public static xo c(long $$0) {
      return xa.a("gui.minutes", $$0);
   }

   public static xa a(boolean $$0) {
      return $$0 ? b : c;
   }

   public static xo a(xa $$0, boolean $$1) {
      return xa.a($$1 ? "options.on.composed" : "options.off.composed", $$0);
   }

   public static xo a(xa $$0, xa $$1) {
      return xa.a("options.generic_value", $$0, $$1);
   }

   public static xo a(xa... $$0) {
      xo $$1 = xa.i();

      for (int $$2 = 0; $$2 < $$0.length; $$2++) {
         $$1.b($$0[$$2]);
         if ($$2 != $$0.length - 1) {
            $$1.b(t);
         }
      }

      return $$1;
   }

   public static xa b(xa... $$0) {
      return a(Arrays.asList($$0));
   }

   public static xa a(Collection<? extends xa> $$0) {
      return xd.a($$0, s);
   }
}
