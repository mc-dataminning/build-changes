import javax.annotation.Nullable;

public abstract class fvj<E extends fvj.a<E>> extends fuh<E> {
   private static final xc a = xc.c("narration.selection.usage");

   public fvj(frf $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public fvj(frf $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public ftw a(fyq $$0) {
      if (this.t() == 0) {
         return null;
      } else if (this.aN_() && $$0 instanceof fyq.a $$1) {
         E $$2 = this.a($$1.b());
         if ($$2 != null) {
            return ftw.a(this, ftw.a($$2));
         } else {
            this.a(null);
            return null;
         }
      } else if (!this.aN_()) {
         E $$3 = this.p();
         if ($$3 == null) {
            $$3 = this.a($$0.a());
         }

         return $$3 == null ? null : ftw.a(this, ftw.a($$3));
      } else {
         return null;
      }
   }

   @Override
   public void a(fyk $$0) {
      E $$1 = this.x();
      if ($$1 != null) {
         this.a($$0.a(), $$1);
         $$1.b($$0);
      } else {
         E $$2 = this.p();
         if ($$2 != null) {
            this.a($$0.a(), $$2);
            $$2.b($$0);
         }
      }

      if (this.aN_()) {
         $$0.a(fyj.d, a);
      }
   }

   public abstract static class a<E extends fvj.a<E>> extends fuh.a<E> implements fyl {
      public abstract xc a();

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void b(fyk $$0) {
         $$0.a(fyj.a, this.a());
      }
   }
}
