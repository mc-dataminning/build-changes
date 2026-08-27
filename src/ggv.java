import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class ggv implements ggl {
   protected final List<fuc> a;
   protected final Map<ic, List<fuc>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final gel f;
   protected final fuo g;
   protected final fum h;

   public ggv(List<fuc> $$0, Map<ic, List<fuc>> $$1, boolean $$2, boolean $$3, boolean $$4, gel $$5, fuo $$6, fum $$7) {
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
   public List<fuc> a(@Nullable djg $$0, @Nullable ic $$1, auu $$2) {
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
   public gel e() {
      return this.f;
   }

   @Override
   public fuo f() {
      return this.g;
   }

   @Override
   public fum g() {
      return this.h;
   }

   public static class a {
      private final List<fuc> a = Lists.newArrayList();
      private final Map<ic, List<fuc>> b = Maps.newEnumMap(ic.class);
      private final fum c;
      private final boolean d;
      private gel e;
      private final boolean f;
      private final boolean g;
      private final fuo h;

      public a(fuh $$0, fum $$1, boolean $$2) {
         this($$0.b(), $$0.c().a(), $$2, $$0.h(), $$1);
      }

      private a(boolean $$0, boolean $$1, boolean $$2, fuo $$3, fum $$4) {
         for (ic $$5 : ic.values()) {
            this.b.put($$5, Lists.newArrayList());
         }

         this.c = $$4;
         this.d = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;
      }

      public ggv.a a(ic $$0, fuc $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public ggv.a a(fuc $$0) {
         this.a.add($$0);
         return this;
      }

      public ggv.a a(gel $$0) {
         this.e = $$0;
         return this;
      }

      public ggv.a a() {
         return this;
      }

      public ggl b() {
         if (this.e == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            return new ggv(this.a, this.b, this.d, this.f, this.g, this.e, this.h, this.c);
         }
      }
   }
}
