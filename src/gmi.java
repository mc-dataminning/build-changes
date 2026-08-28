public class gmi<T extends chy> extends glj<T, gsq, fwu> {
   public static final alb a = alb.b("textures/entity/horse/donkey.png");
   public static final alb b = alb.b("textures/entity/horse/mule.png");
   private final alb k;

   public gmi(gms.a $$0, float $$1, fzz $$2, fzz $$3, boolean $$4) {
      super($$0, new fwu($$0.a($$2)), new fwu($$0.a($$3)), $$1);
      this.k = $$4 ? b : a;
   }

   public alb a(gsq $$0) {
      return this.k;
   }

   public gsq a() {
      return new gsq();
   }

   public void a(T $$0, gsq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }
}
