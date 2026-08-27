import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.Reader;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gem extends aoy<gem.a> {
   public static final gdf a = new gdf("minecraft:empty", bhc.a(1.0F), bhc.a(1.0F), 1, gdf.a.a, false, false, 16);
   public static final afw b = new afw("minecraft", "intentionally_empty");
   public static final gen c = new gen(b, null);
   public static final gdf d = new gdf(b.toString(), bhc.a(1.0F), bhc.a(1.0F), 1, gdf.a.a, false, false, 16);
   static final Logger e = LogUtils.getLogger();
   private static final String f = "sounds.json";
   private static final Gson g = new GsonBuilder().registerTypeHierarchyAdapter(ui.class, new ui.b()).registerTypeAdapter(gdg.class, new gdh()).create();
   private static final TypeToken<Map<String, gdg>> h = new TypeToken<Map<String, gdg>>() {
   };
   private final Map<afw, gen> i = Maps.newHashMap();
   private final gej j;
   private final Map<afw, aor> k = new HashMap<>();

   public gem(ers $$0) {
      this.j = new gej(this, $$0, aow.fromMap(this.k));
   }

   protected gem.a a(aot $$0, bes $$1) {
      gem.a $$2 = new gem.a();
      $$1.a();
      $$1.a("list");
      $$2.a($$0);
      $$1.c();

      for (String $$3 : $$0.a()) {
         $$1.a($$3);

         try {
            for (aor $$5 : $$0.a(new afw($$3, "sounds.json"))) {
               $$1.a($$5.b());

               try (Reader $$6 = $$5.e()) {
                  $$1.a("parse");
                  Map<String, gdg> $$7 = aso.a(g, $$6, h);
                  $$1.b("register");

                  for (Entry<String, gdg> $$8 : $$7.entrySet()) {
                     $$2.a(new afw($$3, $$8.getKey()), $$8.getValue());
                  }

                  $$1.c();
               } catch (RuntimeException var15) {
                  e.warn("Invalid {} in resourcepack: '{}'", new Object[]{"sounds.json", $$5.b(), var15});
               }

               $$1.c();
            }
         } catch (IOException var16) {
         }

         $$1.c();
      }

      $$1.b();
      return $$2;
   }

   protected void a(gem.a $$0, aot $$1, bes $$2) {
      $$0.a(this.i, this.k, this.j);
      if (aa.aT) {
         for (afw $$3 : this.i.keySet()) {
            gen $$4 = this.i.get($$3);
            if (!ul.b($$4.a()) && jy.c.c($$3)) {
               e.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (e.isDebugEnabled()) {
         for (afw $$5 : this.i.keySet()) {
            if (!jy.c.c($$5)) {
               e.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.j.a();
   }

   public List<String> a() {
      return this.j.g();
   }

   static boolean a(gdf $$0, afw $$1, aow $$2) {
      afw $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         e.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public gen a(afw $$0) {
      return this.i.get($$0);
   }

   public Collection<afw> b() {
      return this.i.keySet();
   }

   public void a(gdj $$0) {
      this.j.a($$0);
   }

   public void a(gdi $$0) {
      this.j.c($$0);
   }

   public void a(gdi $$0, int $$1) {
      this.j.a($$0, $$1);
   }

   public void a(eqz $$0) {
      this.j.a($$0);
   }

   public void d() {
      this.j.d();
   }

   public void e() {
      this.j.c();
   }

   public void f() {
      this.j.b();
   }

   public void a(boolean $$0) {
      this.j.a($$0);
   }

   public void g() {
      this.j.e();
   }

   public void a(aqe $$0, float $$1) {
      if ($$0 == aqe.a && $$1 <= 0.0F) {
         this.e();
      }

      this.j.a($$0, $$1);
   }

   public void b(gdi $$0) {
      this.j.a($$0);
   }

   public boolean c(gdi $$0) {
      return this.j.b($$0);
   }

   public void a(gel $$0) {
      this.j.a($$0);
   }

   public void b(gel $$0) {
      this.j.b($$0);
   }

   public void a(@Nullable afw $$0, @Nullable aqe $$1) {
      this.j.a($$0, $$1);
   }

   public String h() {
      return this.j.f();
   }

   public void i() {
      this.j.a();
   }

   protected static class a {
      final Map<afw, gen> a = Maps.newHashMap();
      private Map<afw, aor> b = Map.of();

      void a(aot $$0) {
         this.b = gdf.a.a($$0);
      }

      void a(afw $$0, gdg $$1) {
         gen $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               gem.e.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new gen($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         aow $$4 = aow.fromMap(this.b);

         for (final gdf $$5 : $$1.a()) {
            final afw $$6 = $$5.a();
            geo<gdf> $$8;
            switch ($$5.f()) {
               case a:
                  if (!gem.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new geo<gdf>() {
                     @Override
                     public int e() {
                        gen $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public gdf a(ate $$0) {
                        gen $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return gem.a;
                        } else {
                           gdf $$2 = $$1.a($$0);
                           return new gdf(
                              $$2.a().toString(), new bhi($$2.c(), $$5.c()), new bhi($$2.d(), $$5.d()), $$5.e(), gdf.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i()
                           );
                        }
                     }

                     @Override
                     public void a(gej $$0) {
                        gen $$1 = a.this.a.get($$6);
                        if ($$1 != null) {
                           $$1.a($$0);
                        }
                     }
                  };
                  break;
               default:
                  throw new IllegalStateException("Unknown SoundEventRegistration type: " + $$5.f());
            }

            $$2.a($$8);
         }
      }

      public void a(Map<afw, gen> $$0, Map<afw, aor> $$1, gej $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<afw, gen> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
