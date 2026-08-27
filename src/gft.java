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

public class gft extends api<gft.a> {
   public static final gem a = new gem("minecraft:empty", bhr.a(1.0F), bhr.a(1.0F), 1, gem.a.a, false, false, 16);
   public static final agg b = new agg("minecraft", "intentionally_empty");
   public static final gfu c = new gfu(b, null);
   public static final gem d = new gem(b.toString(), bhr.a(1.0F), bhr.a(1.0F), 1, gem.a.a, false, false, 16);
   static final Logger e = LogUtils.getLogger();
   private static final String f = "sounds.json";
   private static final Gson g = new GsonBuilder().registerTypeHierarchyAdapter(ur.class, new ur.b()).registerTypeAdapter(gen.class, new geo()).create();
   private static final TypeToken<Map<String, gen>> h = new TypeToken<Map<String, gen>>() {
   };
   private final Map<agg, gfu> i = Maps.newHashMap();
   private final gfq j;
   private final Map<agg, apb> k = new HashMap<>();

   public gft(esv $$0) {
      this.j = new gfq(this, $$0, apg.fromMap(this.k));
   }

   protected gft.a a(apd $$0, bfh $$1) {
      gft.a $$2 = new gft.a();
      $$1.a();
      $$1.a("list");
      $$2.a($$0);
      $$1.c();

      for (String $$3 : $$0.a()) {
         $$1.a($$3);

         try {
            for (apb $$5 : $$0.a(new agg($$3, "sounds.json"))) {
               $$1.a($$5.b());

               try (Reader $$6 = $$5.e()) {
                  $$1.a("parse");
                  Map<String, gen> $$7 = asy.a(g, $$6, h);
                  $$1.b("register");

                  for (Entry<String, gen> $$8 : $$7.entrySet()) {
                     $$2.a(new agg($$3, $$8.getKey()), $$8.getValue());
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

   protected void a(gft.a $$0, apd $$1, bfh $$2) {
      $$0.a(this.i, this.k, this.j);
      if (aa.aT) {
         for (agg $$3 : this.i.keySet()) {
            gfu $$4 = this.i.get($$3);
            if (!uu.b($$4.a()) && jy.c.c($$3)) {
               e.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (e.isDebugEnabled()) {
         for (agg $$5 : this.i.keySet()) {
            if (!jy.c.c($$5)) {
               e.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.j.a();
   }

   public List<String> a() {
      return this.j.h();
   }

   static boolean a(gem $$0, agg $$1, apg $$2) {
      agg $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         e.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public gfu a(agg $$0) {
      return this.i.get($$0);
   }

   public Collection<agg> b() {
      return this.i.keySet();
   }

   public void a(geq $$0) {
      this.j.a($$0);
   }

   public void a(gep $$0) {
      this.j.c($$0);
   }

   public void a(gep $$0, int $$1) {
      this.j.a($$0, $$1);
   }

   public void a(esc $$0) {
      this.j.a($$0);
   }

   public void d() {
      this.j.e();
   }

   public void e() {
      this.j.d();
   }

   public void f() {
      this.j.b();
   }

   public void g() {
      this.j.c();
   }

   public void a(boolean $$0) {
      this.j.a($$0);
   }

   public void h() {
      this.j.f();
   }

   public void a(aqo $$0, float $$1) {
      if ($$0 == aqo.a && $$1 <= 0.0F) {
         this.e();
      }

      this.j.a($$0, $$1);
   }

   public void b(gep $$0) {
      this.j.a($$0);
   }

   public boolean c(gep $$0) {
      return this.j.b($$0);
   }

   public void a(gfs $$0) {
      this.j.a($$0);
   }

   public void b(gfs $$0) {
      this.j.b($$0);
   }

   public void a(@Nullable agg $$0, @Nullable aqo $$1) {
      this.j.a($$0, $$1);
   }

   public String i() {
      return this.j.g();
   }

   public void j() {
      this.j.a();
   }

   protected static class a {
      final Map<agg, gfu> a = Maps.newHashMap();
      private Map<agg, apb> b = Map.of();

      void a(apd $$0) {
         this.b = gem.a.a($$0);
      }

      void a(agg $$0, gen $$1) {
         gfu $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               gft.e.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new gfu($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         apg $$4 = apg.fromMap(this.b);

         for (final gem $$5 : $$1.a()) {
            final agg $$6 = $$5.a();
            gfv<gem> $$8;
            switch ($$5.f()) {
               case a:
                  if (!gft.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new gfv<gem>() {
                     @Override
                     public int e() {
                        gfu $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public gem a(ato $$0) {
                        gfu $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return gft.a;
                        } else {
                           gem $$2 = $$1.a($$0);
                           return new gem(
                              $$2.a().toString(), new bhx($$2.c(), $$5.c()), new bhx($$2.d(), $$5.d()), $$5.e(), gem.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i()
                           );
                        }
                     }

                     @Override
                     public void a(gfq $$0) {
                        gfu $$1 = a.this.a.get($$6);
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

      public void a(Map<agg, gfu> $$0, Map<agg, apb> $$1, gfq $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<agg, gfu> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
