import javax.annotation.Nullable;

public class gfa extends geh<cgg, fpy<cgg>> {
   private static final ajh a = new ajh("textures/" + fyh.i.b().a() + ".png");
   private static final ajh[] i = fyh.j.stream().map($$0 -> new ajh("textures/" + $$0.b().a() + ".png")).toArray(ajh[]::new);

   public gfa(gdb.a $$0) {
      super($$0, new fpy<>($$0.a(fre.bk)), 0.0F);
      this.a(new ghp(this));
   }

   public ept a(cgg $$0, float $$1) {
      return $$0.H($$1).orElse(super.a($$0, $$1)).a((double)$$0.eb());
   }

   public boolean a(cgg $$0, gaw $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) ? true : $$0.H(0.0F).filter($$2x -> {
         bpd<?> $$3x = $$0.ai();
         float $$4x = $$3x.l() / 2.0F;
         float $$5 = $$3x.k() / 2.0F;
         ept $$6 = ept.c($$0.dm());
         return $$1.a(new epo($$2x.c, $$2x.d + (double)$$4x, $$2x.e, $$6.c, $$6.d + (double)$$4x, $$6.e).c((double)$$5, (double)$$4x, (double)$$5));
      }).isPresent();
   }

   public ajh a(cgg $$0) {
      return a($$0.go());
   }

   public static ajh a(@Nullable cpd $$0) {
      return $$0 == null ? a : i[$$0.a()];
   }

   protected void a(cgg $$0, eub $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3 + 180.0F, $$4, $$5);
      $$1.a($$0.y().g().b(), 0.0F, 0.5F, 0.0F);
   }
}
