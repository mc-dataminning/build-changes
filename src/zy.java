public record zy(long c, id d) implements zq {
   public static final yg<vi, zy> a = zq.a(zy::a, zy::new);
   public static final zq.b<zy> b = zq.a("debug/neighbors_update");

   private zy(vi $$0) {
      this($$0.m(), $$0.e());
   }

   private void a(vi $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zq.b<zy> a() {
      return b;
   }

   public long b() {
      return this.c;
   }

   public id c() {
      return this.d;
   }
}
