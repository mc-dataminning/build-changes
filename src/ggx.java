import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class ggx implements ggn {
   protected final List<fue> a;
   protected final Map<ic, List<fue>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final gen f;
   protected final fuq g;
   protected final fuo h;

   public ggx(List<fue> $$0, Map<ic, List<fue>> $$1, boolean $$2, boolean $$3, boolean $$4, gen $$5, fuq $$6, fuo $$7) {
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
   public List<fue> a(@Nullable djh $$0, @Nullable ic $$1, auv $$2) {
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
   public gen e() {
      return this.f;
   }

   @Override
   public fuq f() {
      return this.g;
   }

   @Override
   public fuo g() {
      return this.h;
   }

   public static class a {
      private final List<fue> a = Lists.newArrayList();
      private final Map<ic, List<fue>> b = Maps.newEnumMap(ic.class);
      private final fuo c;
      private final boolean d;
      private gen e;
      private final boolean f;
      private final boolean g;
      private final fuq h;

      public a(fuj $$0, fuo $$1, boolean $$2) {
         this($$0.b(), $$0.c().a(), $$2, $$0.h(), $$1);
      }

      private a(boolean $$0, boolean $$1, boolean $$2, fuq $$3, fuo $$4) {
         for (ic $$5 : ic.values()) {
            this.b.put($$5, Lists.newArrayList());
         }

         this.c = $$4;
         this.d = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;
      }

      public ggx.a a(ic $$0, fue $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public ggx.a a(fue $$0) {
         this.a.add($$0);
         return this;
      }

      public ggx.a a(gen $$0) {
         this.e = $$0;
         return this;
      }

      public ggx.a a() {
         return this;
      }

      public ggn b() {
         if (this.e == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            return new ggx(this.a, this.b, this.d, this.f, this.g, this.e, this.h, this.c);
         }
      }
   }
}
