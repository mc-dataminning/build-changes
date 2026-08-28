import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableList.Builder;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class gza implements gym {
   protected final List<ghx> a;
   protected final Map<jj, List<ghx>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final gwk f;
   protected final gij g;
   protected final gih h;

   public gza(List<ghx> $$0, Map<jj, List<ghx>> $$1, boolean $$2, boolean $$3, boolean $$4, gwk $$5, gij $$6, gih $$7) {
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
   public List<ghx> a(@Nullable dua $$0, @Nullable jj $$1, azk $$2) {
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
   public gwk e() {
      return this.f;
   }

   @Override
   public gij f() {
      return this.g;
   }

   @Override
   public gih g() {
      return this.h;
   }

   public static class a {
      private final Builder<ghx> a = ImmutableList.builder();
      private final EnumMap<jj, Builder<ghx>> b = Maps.newEnumMap(jj.class);
      private final gih c;
      private final boolean d;
      @Nullable
      private gwk e;
      private final boolean f;
      private final boolean g;
      private final gij h;

      public a(gic $$0, gih $$1, boolean $$2) {
         this($$0.b(), $$0.c().a(), $$2, $$0.g(), $$1);
      }

      private a(boolean $$0, boolean $$1, boolean $$2, gij $$3, gih $$4) {
         this.c = $$4;
         this.d = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;

         for (jj $$5 : jj.values()) {
            this.b.put($$5, ImmutableList.builder());
         }
      }

      public gza.a a(jj $$0, ghx $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public gza.a a(ghx $$0) {
         this.a.add($$0);
         return this;
      }

      public gza.a a(gwk $$0) {
         this.e = $$0;
         return this;
      }

      public gza.a a() {
         return this;
      }

      public gym b() {
         if (this.e == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            Map<jj, List<ghx>> $$0 = Maps.transformValues(this.b, Builder::build);
            return new gza(this.a.build(), new EnumMap<>($$0), this.d, this.f, this.g, this.e, this.h, this.c);
         }
      }
   }
}
