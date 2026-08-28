import javax.annotation.Nullable;

public abstract class fuu<E extends fuu.a<E>> extends fts<E> {
   private static final xg a = xg.c("narration.selection.usage");

   public fuu(fqq $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public fuu(fqq $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public fth a(fyb $$0) {
      if (this.t() == 0) {
         return null;
      } else if (this.aJ_() && $$0 instanceof fyb.a $$1) {
         E $$2 = this.a($$1.b());
         if ($$2 != null) {
            return fth.a(this, fth.a($$2));
         } else {
            this.a(null);
            return null;
         }
      } else if (!this.aJ_()) {
         E $$3 = this.p();
         if ($$3 == null) {
            $$3 = this.a($$0.a());
         }

         return $$3 == null ? null : fth.a(this, fth.a($$3));
      } else {
         return null;
      }
   }

   @Override
   public void a(fxv $$0) {
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

      if (this.aJ_()) {
         $$0.a(fxu.d, a);
      }
   }

   public abstract static class a<E extends fuu.a<E>> extends fts.a<E> implements fxw {
      public abstract xg a();

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void b(fxv $$0) {
         $$0.a(fxu.a, this.a());
      }
   }
}
