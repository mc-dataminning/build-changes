import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public interface fve {
   fve a = new fve() {
      @Override
      public void a(ftx $$0, int $$1, int $$2) {
      }

      @Override
      public void a(ftx $$0, int $$1, int $$2, int $$3, int $$4) {
      }

      @Override
      public void b(ftx $$0, int $$1, int $$2, int $$3, int $$4) {
      }

      @Override
      public int c(ftx $$0, int $$1, int $$2, int $$3, int $$4) {
         return $$2;
      }

      @Override
      public int a() {
         return 0;
      }

      @Override
      public int b() {
         return 0;
      }
   };

   static fve a(ftv $$0, xa... $$1) {
      return a($$0, Integer.MAX_VALUE, Integer.MAX_VALUE, $$1);
   }

   static fve a(ftv $$0, int $$1, xa... $$2) {
      return a($$0, $$1, Integer.MAX_VALUE, $$2);
   }

   static fve a(ftv $$0, xa $$1, int $$2) {
      return a($$0, $$2, Integer.MAX_VALUE, $$1);
   }

   static fve a(final ftv $$0, final int $$1, final int $$2, final xa... $$3) {
      return $$3.length == 0 ? a : new fve() {
         @Nullable
         private List<fve.a> f;
         @Nullable
         private tu g;

         @Override
         public void a(ftx $$0x, int $$1x, int $$2x) {
            this.a($$0, $$1, $$2, 9, -1);
         }

         @Override
         public void a(ftx $$0x, int $$1x, int $$2x, int $$3x, int $$4) {
            int $$5 = $$2;

            for (fve.a $$6 : this.c()) {
               $$0.a($$0, $$6.a, $$1, $$5, $$4);
               $$5 += $$3;
            }
         }

         @Override
         public void b(ftx $$0x, int $$1x, int $$2x, int $$3x, int $$4) {
            int $$5 = $$2;

            for (fve.a $$6 : this.c()) {
               $$0.b($$0, $$6.a, $$1, $$5, $$4);
               $$5 += $$3;
            }
         }

         @Override
         public int c(ftx $$0x, int $$1x, int $$2x, int $$3x, int $$4) {
            int $$5 = $$2;

            for (fve.a $$6 : this.c()) {
               $$0.a($$0, $$6.a, $$1, $$5, $$4, false);
               $$5 += $$3;
            }

            return $$5;
         }

         private List<fve.a> c() {
            tu $$0 = tu.a();
            if (this.f != null && $$0 == this.g) {
               return this.f;
            } else {
               this.g = $$0;
               List<aza> $$1 = new ArrayList<>();

               for (xa $$2 : $$3) {
                  $$1.addAll($$0.c($$2, $$1));
               }

               this.f = new ArrayList<>();

               for (aza $$3 : $$1.subList(0, Math.min($$1.size(), $$2))) {
                  this.f.add(new fve.a($$3, $$0.a($$3)));
               }

               return this.f;
            }
         }

         @Override
         public int a() {
            return this.c().size();
         }

         @Override
         public int b() {
            return Math.min($$1, this.c().stream().mapToInt(fve.a::b).max().orElse(0));
         }
      };
   }

   void a(ftx var1, int var2, int var3);

   void a(ftx var1, int var2, int var3, int var4, int var5);

   void b(ftx var1, int var2, int var3, int var4, int var5);

   int c(ftx var1, int var2, int var3, int var4, int var5);

   int a();

   int b();

   public static record a(aza a, int b) {
   }
}
