import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class fxh {
   private static final Set<je> a = EnumSet.allOf(je.class);
   private final List<fxf> b = Lists.newArrayList();
   private int c;
   private int d;
   private boolean e;

   public fxh a(int $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
      return this;
   }

   public fxh a() {
      return this.a(true);
   }

   public fxh a(boolean $$0) {
      this.e = $$0;
      return this;
   }

   public fxh a(String $$0, float $$1, float $$2, float $$3, int $$4, int $$5, int $$6, fxg $$7, int $$8, int $$9) {
      this.a($$8, $$9);
      this.b.add(new fxf($$0, (float)this.c, (float)this.d, $$1, $$2, $$3, (float)$$4, (float)$$5, (float)$$6, $$7, this.e, 1.0F, 1.0F, a));
      return this;
   }

   public fxh a(String $$0, float $$1, float $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
      this.a($$7, $$8);
      this.b.add(new fxf($$0, (float)this.c, (float)this.d, $$1, $$2, $$3, (float)$$4, (float)$$5, (float)$$6, fxg.a, this.e, 1.0F, 1.0F, a));
      return this;
   }

   public fxh a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.b.add(new fxf(null, (float)this.c, (float)this.d, $$0, $$1, $$2, $$3, $$4, $$5, fxg.a, this.e, 1.0F, 1.0F, a));
      return this;
   }

   public fxh a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, Set<je> $$6) {
      this.b.add(new fxf(null, (float)this.c, (float)this.d, $$0, $$1, $$2, $$3, $$4, $$5, fxg.a, this.e, 1.0F, 1.0F, $$6));
      return this;
   }

   public fxh a(String $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
      this.b.add(new fxf($$0, (float)this.c, (float)this.d, $$1, $$2, $$3, $$4, $$5, $$6, fxg.a, this.e, 1.0F, 1.0F, a));
      return this;
   }

   public fxh a(String $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6, fxg $$7) {
      this.b.add(new fxf($$0, (float)this.c, (float)this.d, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.e, 1.0F, 1.0F, a));
      return this;
   }

   public fxh a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, boolean $$6) {
      this.b.add(new fxf(null, (float)this.c, (float)this.d, $$0, $$1, $$2, $$3, $$4, $$5, fxg.a, $$6, 1.0F, 1.0F, a));
      return this;
   }

   public fxh a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, fxg $$6, float $$7, float $$8) {
      this.b.add(new fxf(null, (float)this.c, (float)this.d, $$0, $$1, $$2, $$3, $$4, $$5, $$6, this.e, $$7, $$8, a));
      return this;
   }

   public fxh a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, fxg $$6) {
      this.b.add(new fxf(null, (float)this.c, (float)this.d, $$0, $$1, $$2, $$3, $$4, $$5, $$6, this.e, 1.0F, 1.0F, a));
      return this;
   }

   public List<fxf> b() {
      return ImmutableList.copyOf(this.b);
   }

   public static fxh c() {
      return new fxh();
   }
}
