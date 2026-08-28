import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class grz implements grp {
   protected final List<gfa> a;
   protected final Map<jf, List<gfa>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final gpo f;
   protected final gfm g;
   protected final gfk h;

   public grz(List<gfa> $$0, Map<jf, List<gfa>> $$1, boolean $$2, boolean $$3, boolean $$4, gpo $$5, gfm $$6, gfk $$7) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$4;
      this.e = $$3;
      this.f = $$5;
      this.g = $$6;
      this.h = $$7;
   }

   @Override
   public List<gfa> a(@Nullable dsk $$0, @Nullable jf $$1, ayo $$2) {
      return $$1 == null ? this.a : this.b.get($$1);
   }

   @Override
   public boolean a() {
      return this.c;
   }

   @Override
   public boolean b() {
      return this.d;
   }

   @Override
   public boolean c() {
      return this.e;
   }

   @Override
   public boolean d() {
      return false;
   }

   @Override
   public gpo e() {
      return this.f;
   }

   @Override
   public gfm f() {
      return this.g;
   }

   @Override
   public gfk g() {
      return this.h;
   }

   public static class a {
      private final List<gfa> a = Lists.newArrayList();
      private final Map<jf, List<gfa>> b = Maps.newEnumMap(jf.class);
      private final gfk c;
      private final boolean d;
      private gpo e;
      private final boolean f;
      private final boolean g;
      private final gfm h;

      public a(gff $$0, gfk $$1, boolean $$2) {
         this($$0.b(), $$0.c().a(), $$2, $$0.h(), $$1);
      }

      private a(boolean $$0, boolean $$1, boolean $$2, gfm $$3, gfk $$4) {
         for (jf $$5 : jf.values()) {
            this.b.put($$5, Lists.newArrayList());
         }

         this.c = $$4;
         this.d = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;
      }

      public grz.a a(jf $$0, gfa $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public grz.a a(gfa $$0) {
         this.a.add($$0);
         return this;
      }

      public grz.a a(gpo $$0) {
         this.e = $$0;
         return this;
      }

      public grz.a a() {
         return this;
      }

      public grp b() {
         if (this.e == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            return new grz(this.a, this.b, this.d, this.f, this.g, this.e, this.h, this.c);
         }
      }
   }
}
