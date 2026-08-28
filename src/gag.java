import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class gag {
   private static final Set<jj> a = EnumSet.allOf(jj.class);
   private final List<gae> b = Lists.newArrayList();
   private int c;
   private int d;
   private boolean e;

   public gag a(int $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
      return this;
   }

   public gag a() {
      return this.a(true);
   }

   public gag a(boolean $$0) {
      this.e = $$0;
      return this;
   }

   public gag a(String $$0, float $$1, float $$2, float $$3, int $$4, int $$5, int $$6, gaf $$7, int $$8, int $$9) {
      this.a($$8, $$9);
      this.b.add(new gae($$0, (float)this.c, (float)this.d, $$1, $$2, $$3, (float)$$4, (float)$$5, (float)$$6, $$7, this.e, 1.0F, 1.0F, a));
      return this;
   }

   public gag a(String $$0, float $$1, float $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
      this.a($$7, $$8);
      this.b.add(new gae($$0, (float)this.c, (float)this.d, $$1, $$2, $$3, (float)$$4, (float)$$5, (float)$$6, gaf.a, this.e, 1.0F, 1.0F, a));
      return this;
   }

   public gag a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.b.add(new gae(null, (float)this.c, (float)this.d, $$0, $$1, $$2, $$3, $$4, $$5, gaf.a, this.e, 1.0F, 1.0F, a));
      return this;
   }

   public gag a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, Set<jj> $$6) {
      this.b.add(new gae(null, (float)this.c, (float)this.d, $$0, $$1, $$2, $$3, $$4, $$5, gaf.a, this.e, 1.0F, 1.0F, $$6));
      return this;
   }

   public gag a(String $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
      this.b.add(new gae($$0, (float)this.c, (float)this.d, $$1, $$2, $$3, $$4, $$5, $$6, gaf.a, this.e, 1.0F, 1.0F, a));
      return this;
   }

   public gag a(String $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6, gaf $$7) {
      this.b.add(new gae($$0, (float)this.c, (float)this.d, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.e, 1.0F, 1.0F, a));
      return this;
   }

   public gag a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, boolean $$6) {
      this.b.add(new gae(null, (float)this.c, (float)this.d, $$0, $$1, $$2, $$3, $$4, $$5, gaf.a, $$6, 1.0F, 1.0F, a));
      return this;
   }

   public gag a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, gaf $$6, float $$7, float $$8) {
      this.b.add(new gae(null, (float)this.c, (float)this.d, $$0, $$1, $$2, $$3, $$4, $$5, $$6, this.e, $$7, $$8, a));
      return this;
   }

   public gag a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, gaf $$6) {
      this.b.add(new gae(null, (float)this.c, (float)this.d, $$0, $$1, $$2, $$3, $$4, $$5, $$6, this.e, 1.0F, 1.0F, a));
      return this;
   }

   public List<gae> b() {
      return ImmutableList.copyOf(this.b);
   }

   public static gag c() {
      return new gag();
   }
}
