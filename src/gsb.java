import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class gsb implements grr {
   protected final List<gfc> a;
   protected final Map<jf, List<gfc>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final gpq f;
   protected final gfo g;
   protected final gfm h;

   public gsb(List<gfc> $$0, Map<jf, List<gfc>> $$1, boolean $$2, boolean $$3, boolean $$4, gpq $$5, gfo $$6, gfm $$7) {
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
   public List<gfc> a(@Nullable dsl $$0, @Nullable jf $$1, ayo $$2) {
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
   public gpq e() {
      return this.f;
   }

   @Override
   public gfo f() {
      return this.g;
   }

   @Override
   public gfm g() {
      return this.h;
   }

   public static class a {
      private final List<gfc> a = Lists.newArrayList();
      private final Map<jf, List<gfc>> b = Maps.newEnumMap(jf.class);
      private final gfm c;
      private final boolean d;
      private gpq e;
      private final boolean f;
      private final boolean g;
      private final gfo h;

      public a(gfh $$0, gfm $$1, boolean $$2) {
         this($$0.b(), $$0.c().a(), $$2, $$0.h(), $$1);
      }

      private a(boolean $$0, boolean $$1, boolean $$2, gfo $$3, gfm $$4) {
         for (jf $$5 : jf.values()) {
            this.b.put($$5, Lists.newArrayList());
         }

         this.c = $$4;
         this.d = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;
      }

      public gsb.a a(jf $$0, gfc $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public gsb.a a(gfc $$0) {
         this.a.add($$0);
         return this;
      }

      public gsb.a a(gpq $$0) {
         this.e = $$0;
         return this;
      }

      public gsb.a a() {
         return this;
      }

      public grr b() {
         if (this.e == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            return new gsb(this.a, this.b, this.d, this.f, this.g, this.e, this.h, this.c);
         }
      }
   }
}
