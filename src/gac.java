import java.util.List;
import javax.annotation.Nullable;

public class gac extends fxi {
   private static final int a = 310;
   private static final int b = 25;
   private static final ww c = ww.c("menu.server_links.title");
   private final fxi d;
   @Nullable
   private gac.a s;
   final fve u = new fve(this);
   final alw v;

   public gac(fxi $$0, alw $$1) {
      super(c);
      this.d = $$0;
      this.v = $$1;
   }

   @Override
   protected void aN_() {
      this.u.a(this.l, this.p);
      this.s = this.u.c(new gac.a(this.m, this.n, this));
      this.u.b(frq.a(wv.k, $$0 -> this.aK_()).a(200).a());
      this.u.a($$1 -> {
         fro var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.u.a();
      if (this.s != null) {
         this.s.a(this.n, this.u);
      }
   }

   @Override
   public void aK_() {
      this.m.a(this.d);
   }

   static class a extends frw<gac.b> {
      public a(fof $$0, int $$1, gac $$2) {
         super($$0, $$1, $$2.u.d(), $$2.u.c(), 25);
         $$2.v.c().forEach($$1x -> this.b(new gac.b($$2, $$1x)));
      }

      @Override
      public int a() {
         return 310;
      }

      @Override
      public void a(int $$0, fve $$1) {
         super.a($$0, $$1);
         int $$2 = $$0 / 2 - 155;
         this.aD_().forEach($$1x -> $$1x.a.j($$2));
      }
   }

   static class b extends frw.a<gac.b> {
      final fro a;

      b(fxi $$0, alw.a $$1) {
         this.a = frq.a($$1.a(), fwf.b($$0, $$1.c(), false)).a(310).a();
      }

      @Override
      public void a(frc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a.k($$2);
         this.a.a($$0, $$6, $$7, $$9);
      }

      @Override
      public List<? extends ftn> aD_() {
         return List.of(this.a);
      }

      @Override
      public List<? extends fvl> b() {
         return List.of(this.a);
      }
   }
}
