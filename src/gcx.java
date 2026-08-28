import java.util.List;
import javax.annotation.Nullable;

public class gcx extends gad {
   private static final int a = 310;
   private static final int b = 25;
   private static final xa c = xa.c("menu.server_links.title");
   private final gad d;
   @Nullable
   private gcx.a s;
   final fxz u = new fxz(this);
   final ama v;

   public gcx(gad $$0, ama $$1) {
      super(c);
      this.d = $$0;
      this.v = $$1;
   }

   @Override
   protected void aS_() {
      this.u.a(this.l, this.p);
      this.s = this.u.c(new gcx.a(this.m, this.n, this));
      this.u.b(ful.a(wz.k, $$0 -> this.aP_()).a(200).a());
      this.u.a($$1 -> {
         fuj var10000 = this.c($$1);
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
   public void aP_() {
      this.m.a(this.d);
   }

   static class a extends fur<gcx.b> {
      public a(frd $$0, int $$1, gcx $$2) {
         super($$0, $$1, $$2.u.d(), $$2.u.c(), 25);
         $$2.v.c().forEach($$1x -> this.b(new gcx.b($$2, $$1x)));
      }

      @Override
      public int a() {
         return 310;
      }

      @Override
      public void a(int $$0, fxz $$1) {
         super.a($$0, $$1);
         int $$2 = $$0 / 2 - 155;
         this.aI_().forEach($$1x -> $$1x.a.j($$2));
      }
   }

   static class b extends fur.a<gcx.b> {
      final fuj a;

      b(gad $$0, ama.a $$1) {
         this.a = ful.a($$1.a(), fza.b($$0, $$1.c(), false)).a(310).a();
      }

      @Override
      public void a(ftx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a.k($$2);
         this.a.a($$0, $$6, $$7, $$9);
      }

      @Override
      public List<? extends fwi> aI_() {
         return List.of(this.a);
      }

      @Override
      public List<? extends fyg> b() {
         return List.of(this.a);
      }
   }
}
