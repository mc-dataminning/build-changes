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

public class gtq extends auq<gtq.a> {
   public static final gsf a = new gsf("minecraft:empty", bpq.a(1.0F), bpq.a(1.0F), 1, gsf.a.a, false, false, 16);
   public static final alb b = new alb("minecraft", "intentionally_empty");
   public static final gtr c = new gtr(b, null);
   public static final gsf d = new gsf(b.toString(), bpq.a(1.0F), bpq.a(1.0F), 1, gsf.a.a, false, false, 16);
   static final Logger e = LogUtils.getLogger();
   private static final String f = "sounds.json";
   private static final Gson g = new GsonBuilder().registerTypeHierarchyAdapter(xl.class, new xl.b(jw.b)).registerTypeAdapter(gsg.class, new gsh()).create();
   private static final TypeToken<Map<String, gsg>> h = new TypeToken<Map<String, gsg>>() {
   };
   private final Map<alb, gtr> i = Maps.newHashMap();
   private final gtn j;
   private final Map<alb, auj> k = new HashMap<>();

   public gtq(ffe $$0) {
      this.j = new gtn(this, $$0, auo.fromMap(this.k));
   }

   protected gtq.a a(aul $$0, bnd $$1) {
      gtq.a $$2 = new gtq.a();
      $$1.a();
      $$1.a("list");
      $$2.a($$0);
      $$1.c();

      for (String $$3 : $$0.a()) {
         $$1.a($$3);

         try {
            for (auj $$5 : $$0.a(new alb($$3, "sounds.json"))) {
               $$1.a($$5.b());

               try (Reader $$6 = $$5.e()) {
                  $$1.a("parse");
                  Map<String, gsg> $$7 = ayk.a(g, $$6, h);
                  $$1.b("register");

                  for (Entry<String, gsg> $$8 : $$7.entrySet()) {
                     $$2.a(new alb($$3, $$8.getKey()), $$8.getValue());
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

   protected void a(gtq.a $$0, aul $$1, bnd $$2) {
      $$0.a(this.i, this.k, this.j);
      if (aa.aX) {
         for (alb $$3 : this.i.keySet()) {
            gtr $$4 = this.i.get($$3);
            if (!xo.b($$4.a()) && lp.b.d($$3)) {
               e.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (e.isDebugEnabled()) {
         for (alb $$5 : this.i.keySet()) {
            if (!lp.b.d($$5)) {
               e.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.j.a();
   }

   public List<String> a() {
      return this.j.h();
   }

   public exr b() {
      return this.j.i();
   }

   static boolean a(gsf $$0, alb $$1, auo $$2) {
      alb $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         e.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public gtr a(alb $$0) {
      return this.i.get($$0);
   }

   public Collection<alb> d() {
      return this.i.keySet();
   }

   public void a(gsj $$0) {
      this.j.a($$0);
   }

   public void a(gsi $$0) {
      this.j.c($$0);
   }

   public void a(gsi $$0, int $$1) {
      this.j.a($$0, $$1);
   }

   public void a(fel $$0) {
      this.j.a($$0);
   }

   public void e() {
      this.j.e();
   }

   public void f() {
      this.j.d();
   }

   public void g() {
      this.j.b();
   }

   public void h() {
      this.j.c();
   }

   public void a(boolean $$0) {
      this.j.a($$0);
   }

   public void i() {
      this.j.f();
   }

   public void a(avx $$0, float $$1) {
      if ($$0 == avx.a && $$1 <= 0.0F) {
         this.f();
      }

      this.j.a($$0, $$1);
   }

   public void b(gsi $$0) {
      this.j.a($$0);
   }

   public boolean c(gsi $$0) {
      return this.j.b($$0);
   }

   public void a(gtp $$0) {
      this.j.a($$0);
   }

   public void b(gtp $$0) {
      this.j.b($$0);
   }

   public void a(@Nullable alb $$0, @Nullable avx $$1) {
      this.j.a($$0, $$1);
   }

   public String j() {
      return this.j.g();
   }

   public void k() {
      this.j.a();
   }

   protected static class a {
      final Map<alb, gtr> a = Maps.newHashMap();
      private Map<alb, auj> b = Map.of();

      void a(aul $$0) {
         this.b = gsf.a.a($$0);
      }

      void a(alb $$0, gsg $$1) {
         gtr $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               gtq.e.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new gtr($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         auo $$4 = auo.fromMap(this.b);

         for (final gsf $$5 : $$1.a()) {
            final alb $$6 = $$5.a();
            gts<gsf> $$8;
            switch ($$5.f()) {
               case a:
                  if (!gtq.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new gts<gsf>() {
                     @Override
                     public int e() {
                        gtr $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public gsf a(azc $$0) {
                        gtr $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return gtq.a;
                        } else {
                           gsf $$2 = $$1.a($$0);
                           return new gsf(
                              $$2.a().toString(), new bpw($$2.c(), $$5.c()), new bpw($$2.d(), $$5.d()), $$5.e(), gsf.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i()
                           );
                        }
                     }

                     @Override
                     public void a(gtn $$0) {
                        gtr $$1 = a.this.a.get($$6);
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

      public void a(Map<alb, gtr> $$0, Map<alb, auj> $$1, gtn $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<alb, gtr> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
