import java.util.Arrays;
import java.util.Collection;

public class wt {
   public static final wu a = wu.i();
   public static final wu b = wu.c("options.on");
   public static final wu c = wu.c("options.off");
   public static final wu d = wu.c("gui.done");
   public static final wu e = wu.c("gui.cancel");
   public static final wu f = wu.c("gui.yes");
   public static final wu g = wu.c("gui.no");
   public static final wu h = wu.c("gui.ok");
   public static final wu i = wu.c("gui.proceed");
   public static final wu j = wu.c("gui.continue");
   public static final wu k = wu.c("gui.back");
   public static final wu l = wu.c("gui.toTitle");
   public static final wu m = wu.c("gui.acknowledge");
   public static final wu n = wu.c("chat.link.open");
   public static final wu o = wu.c("gui.copy_link_to_clipboard");
   public static final wu p = wu.c("menu.disconnect");
   public static final wu q = wu.c("connect.failed.transfer");
   public static final wu r = wu.c("connect.failed");
   public static final wu s = wu.b("\n");
   public static final wu t = wu.b(". ");
   public static final wu u = wu.b("...");
   public static final wu v = a();

   public static xi a() {
      return wu.b(" ");
   }

   public static xi a(long $$0) {
      return wu.a("gui.days", $$0);
   }

   public static xi b(long $$0) {
      return wu.a("gui.hours", $$0);
   }

   public static xi c(long $$0) {
      return wu.a("gui.minutes", $$0);
   }

   public static wu a(boolean $$0) {
      return $$0 ? b : c;
   }

   public static xi a(wu $$0, boolean $$1) {
      return wu.a($$1 ? "options.on.composed" : "options.off.composed", $$0);
   }

   public static xi a(wu $$0, wu $$1) {
      return wu.a("options.generic_value", $$0, $$1);
   }

   public static xi a(wu... $$0) {
      xi $$1 = wu.i();

      for (int $$2 = 0; $$2 < $$0.length; $$2++) {
         $$1.b($$0[$$2]);
         if ($$2 != $$0.length - 1) {
            $$1.b(t);
         }
      }

      return $$1;
   }

   public static wu b(wu... $$0) {
      return a(Arrays.asList($$0));
   }

   public static wu a(Collection<? extends wu> $$0) {
      return wx.a($$0, s);
   }
}
