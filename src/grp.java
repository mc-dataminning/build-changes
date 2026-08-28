import java.util.Optional;

public class grp implements grn {
   private final grn.a a;
   private final grn.a b = grn.a(new fla(1536));
   private int c = 255;
   private int d = 255;
   private int e = 255;
   private int f = 255;

   public grp(grn.a $$0) {
      this.a = $$0;
   }

   @Override
   public flg getBuffer(gry $$0) {
      if ($$0.S()) {
         flg $$1 = this.b.getBuffer($$0);
         return new grp.a($$1, this.c, this.d, this.e, this.f);
      } else {
         flg $$2 = this.a.getBuffer($$0);
         Optional<gry> $$3 = $$0.R();
         if ($$3.isPresent()) {
            flg $$4 = this.b.getBuffer($$3.get());
            grp.a $$5 = new grp.a($$4, this.c, this.d, this.e, this.f);
            return flh.a($$5, $$2);
         } else {
            return $$2;
         }
      }
   }

   public void a(int $$0, int $$1, int $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public void a() {
      this.b.b();
   }

   static record a(flg a, int b) implements flg {
      public a(flg $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, ayh.a($$4, $$1, $$2, $$3));
      }

      @Override
      public flg a(float $$0, float $$1, float $$2) {
         this.a.a($$0, $$1, $$2).a(this.b);
         return this;
      }

      @Override
      public flg a(int $$0, int $$1, int $$2, int $$3) {
         return this;
      }

      @Override
      public flg a(float $$0, float $$1) {
         this.a.a($$0, $$1);
         return this;
      }

      @Override
      public flg a(int $$0, int $$1) {
         return this;
      }

      @Override
      public flg b(int $$0, int $$1) {
         return this;
      }

      @Override
      public flg b(float $$0, float $$1, float $$2) {
         return this;
      }
   }
}
