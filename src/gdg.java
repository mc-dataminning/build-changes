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

public class gdg extends anr<gdg.a> {
   public static final gbz a = new gbz("minecraft:empty", bfr.a(1.0F), bfr.a(1.0F), 1, gbz.a.a, false, false, 16);
   public static final aer b = new aer("minecraft", "intentionally_empty");
   public static final gdh c = new gdh(b, null);
   public static final gbz d = new gbz(b.toString(), bfr.a(1.0F), bfr.a(1.0F), 1, gbz.a.a, false, false, 16);
   static final Logger e = LogUtils.getLogger();
   private static final String f = "sounds.json";
   private static final Gson g = new GsonBuilder().registerTypeHierarchyAdapter(tf.class, new tf.a()).registerTypeAdapter(gca.class, new gcb()).create();
   private static final TypeToken<Map<String, gca>> h = new TypeToken<Map<String, gca>>() {
   };
   private final Map<aer, gdh> i = Maps.newHashMap();
   private final gdd j;
   private final Map<aer, ank> k = new HashMap<>();

   public gdg(eqp $$0) {
      this.j = new gdd(this, $$0, anp.fromMap(this.k));
   }

   protected gdg.a a(anm $$0, bdh $$1) {
      gdg.a $$2 = new gdg.a();
      $$1.a();
      $$1.a("list");
      $$2.a($$0);
      $$1.c();

      for (String $$3 : $$0.a()) {
         $$1.a($$3);

         try {
            for (ank $$5 : $$0.a(new aer($$3, "sounds.json"))) {
               $$1.a($$5.b());

               try (Reader $$6 = $$5.e()) {
                  $$1.a("parse");
                  Map<String, gca> $$7 = arg.a(g, $$6, h);
                  $$1.b("register");

                  for (Entry<String, gca> $$8 : $$7.entrySet()) {
                     $$2.a(new aer($$3, $$8.getKey()), $$8.getValue());
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

   protected void a(gdg.a $$0, anm $$1, bdh $$2) {
      $$0.a(this.i, this.k, this.j);
      if (aa.aS) {
         for (aer $$3 : this.i.keySet()) {
            gdh $$4 = this.i.get($$3);
            if (!th.b($$4.a()) && jb.c.c($$3)) {
               e.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (e.isDebugEnabled()) {
         for (aer $$5 : this.i.keySet()) {
            if (!jb.c.c($$5)) {
               e.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.j.a();
   }

   public List<String> a() {
      return this.j.g();
   }

   static boolean a(gbz $$0, aer $$1, anp $$2) {
      aer $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         e.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public gdh a(aer $$0) {
      return this.i.get($$0);
   }

   public Collection<aer> b() {
      return this.i.keySet();
   }

   public void a(gcd $$0) {
      this.j.a($$0);
   }

   public void a(gcc $$0) {
      this.j.c($$0);
   }

   public void a(gcc $$0, int $$1) {
      this.j.a($$0, $$1);
   }

   public void a(epw $$0) {
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

   public void a(aox $$0, float $$1) {
      if ($$0 == aox.a && $$1 <= 0.0F) {
         this.e();
      }

      this.j.a($$0, $$1);
   }

   public void b(gcc $$0) {
      this.j.a($$0);
   }

   public boolean c(gcc $$0) {
      return this.j.b($$0);
   }

   public void a(gdf $$0) {
      this.j.a($$0);
   }

   public void b(gdf $$0) {
      this.j.b($$0);
   }

   public void a(@Nullable aer $$0, @Nullable aox $$1) {
      this.j.a($$0, $$1);
   }

   public String h() {
      return this.j.f();
   }

   public void i() {
      this.j.a();
   }

   protected static class a {
      final Map<aer, gdh> a = Maps.newHashMap();
      private Map<aer, ank> b = Map.of();

      void a(anm $$0) {
         this.b = gbz.a.a($$0);
      }

      void a(aer $$0, gca $$1) {
         gdh $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               gdg.e.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new gdh($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         anp $$4 = anp.fromMap(this.b);

         for (final gbz $$5 : $$1.a()) {
            final aer $$6 = $$5.a();
            gdi<gbz> $$8;
            switch ($$5.f()) {
               case a:
                  if (!gdg.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new gdi<gbz>() {
                     @Override
                     public int e() {
                        gdh $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public gbz a(aru $$0) {
                        gdh $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return gdg.a;
                        } else {
                           gbz $$2 = $$1.a($$0);
                           return new gbz(
                              $$2.a().toString(), new bfx($$2.c(), $$5.c()), new bfx($$2.d(), $$5.d()), $$5.e(), gbz.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i()
                           );
                        }
                     }

                     @Override
                     public void a(gdd $$0) {
                        gdh $$1 = a.this.a.get($$6);
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

      public void a(Map<aer, gdh> $$0, Map<aer, ank> $$1, gdd $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<aer, gdh> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
