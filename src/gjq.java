public abstract class gjq extends gki {
   protected gjq(gga $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      this.B = 0.96F;
      this.j = this.j * 0.01F + $$4;
      this.k = this.k * 0.01F + $$5;
      this.l = this.l * 0.01F + $$6;
      this.g = this.g + (double)((this.r.i() - this.r.i()) * 0.05F);
      this.h = this.h + (double)((this.r.i() - this.r.i()) * 0.05F);
      this.i = this.i + (double)((this.r.i() - this.r.i()) * 0.05F);
      this.t = (int)(8.0 / (Math.random() * 0.8 + 0.2)) + 4;
   }
}
