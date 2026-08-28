import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Consumer;

public class fwv {
   int a;
   final Map<fwv.a, fwv.b> b = Maps.newTreeMap(Comparator.<fwv.a, fwr>comparing($$0 -> $$0.a).thenComparing($$0 -> $$0.b));

   public void a(Consumer<fws> $$0) {
      this.a++;
      $$0.accept(new fwv.c(0));
   }

   public String a(boolean $$0) {
      final StringBuilder $$1 = new StringBuilder();
      Consumer<String> $$2 = new Consumer<String>() {
         private boolean b = true;

         public void a(String $$0) {
            if (!this.b) {
               $$1.append(". ");
            }

            this.b = false;
            $$1.append($$0);
         }
      };
      this.b.forEach(($$2x, $$3) -> {
         if ($$3.b == this.a && ($$0 || !$$3.c)) {
            $$3.a.a($$2);
            $$3.c = true;
         }
      });
      return $$1.toString();
   }

   static class a {
      final fwr a;
      final int b;

      a(fwr $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }

   static class b {
      fwu<?> a;
      int b;
      boolean c;

      b() {
         this.a = fwu.a;
         this.b = -1;
      }

      public fwv.b a(int $$0, fwu<?> $$1) {
         if (!this.a.equals($$1)) {
            this.a = $$1;
            this.c = false;
         } else if (this.b + 1 != $$0) {
            this.c = false;
         }

         this.b = $$0;
         return this;
      }
   }

   class c implements fws {
      private final int b;

      c(final int $$0) {
         this.b = $$0;
      }

      @Override
      public void a(fwr $$0, fwu<?> $$1) {
         fwv.this.b.computeIfAbsent(new fwv.a($$0, this.b), $$0x -> new fwv.b()).a(fwv.this.a, $$1);
      }

      @Override
      public fws a() {
         return fwv.this.new c(this.b + 1);
      }
   }
}
