public class grg<S extends gts & guk, M extends fxa<? super S>> extends grf<S, M> {
   private final alb a;
   private final M b;
   private final M c;

   public grg(goo<S, M> $$0, M $$1, M $$2, alb $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.a = $$3;
   }

   public grg(goo<S, M> $$0, M $$1, alb $$2) {
      this($$0, $$1, $$1, $$2);
   }

   public void a(fcu $$0, ggv $$1, int $$2, S $$3, float $$4, float $$5) {
      if ($$3.c()) {
         M $$6 = $$3.ae ? this.c : this.b;
         $$6.a($$3);
         fcy $$7 = $$1.getBuffer(ghe.f(this.a));
         $$6.a($$0, $$7, $$2, gwb.d);
      }
   }
}
