import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class gbf implements gav {
   protected final List<foq> a;
   protected final Map<ha, List<foq>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final fyu f;
   protected final fpd g;
   protected final fpb h;

   public gbf(List<foq> $$0, Map<ha, List<foq>> $$1, boolean $$2, boolean $$3, boolean $$4, fyu $$5, fpd $$6, fpb $$7) {
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
   public List<foq> a(@Nullable dez $$0, @Nullable ha $$1, aru $$2) {
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
   public fyu e() {
      return this.f;
   }

   @Override
   public fpd f() {
      return this.g;
   }

   @Override
   public fpb g() {
      return this.h;
   }

   public static class a {
      private final List<foq> a = Lists.newArrayList();
      private final Map<ha, List<foq>> b = Maps.newEnumMap(ha.class);
      private final fpb c;
      private final boolean d;
      private fyu e;
      private final boolean f;
      private final boolean g;
      private final fpd h;

      public a(fow $$0, fpb $$1, boolean $$2) {
         this($$0.b(), $$0.c().a(), $$2, $$0.h(), $$1);
      }

      private a(boolean $$0, boolean $$1, boolean $$2, fpd $$3, fpb $$4) {
         for (ha $$5 : ha.values()) {
            this.b.put($$5, Lists.newArrayList());
         }

         this.c = $$4;
         this.d = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;
      }

      public gbf.a a(ha $$0, foq $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public gbf.a a(foq $$0) {
         this.a.add($$0);
         return this;
      }

      public gbf.a a(fyu $$0) {
         this.e = $$0;
         return this;
      }

      public gbf.a a() {
         return this;
      }

      public gav b() {
         if (this.e == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            return new gbf(this.a, this.b, this.d, this.f, this.g, this.e, this.h, this.c);
         }
      }
   }
}
