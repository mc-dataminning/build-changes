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

public class gll extends asf<gll.a> {
   public static final gke a = new gke("minecraft:empty", bkv.a(1.0F), bkv.a(1.0F), 1, gke.a.a, false, false, 16);
   public static final aiy b = new aiy("minecraft", "intentionally_empty");
   public static final glm c = new glm(b, null);
   public static final gke d = new gke(b.toString(), bkv.a(1.0F), bkv.a(1.0F), 1, gke.a.a, false, false, 16);
   static final Logger e = LogUtils.getLogger();
   private static final String f = "sounds.json";
   private static final Gson g = new GsonBuilder().registerTypeHierarchyAdapter(vq.class, new vq.b()).registerTypeAdapter(gkf.class, new gkg()).create();
   private static final TypeToken<Map<String, gkf>> h = new TypeToken<Map<String, gkf>>() {
   };
   private final Map<aiy, glm> i = Maps.newHashMap();
   private final gli j;
   private final Map<aiy, ary> k = new HashMap<>();

   public gll(exl $$0) {
      this.j = new gli(this, $$0, asd.fromMap(this.k));
   }

   protected gll.a a(asa $$0, bil $$1) {
      gll.a $$2 = new gll.a();
      $$1.a();
      $$1.a("list");
      $$2.a($$0);
      $$1.c();

      for (String $$3 : $$0.a()) {
         $$1.a($$3);

         try {
            for (ary $$5 : $$0.a(new aiy($$3, "sounds.json"))) {
               $$1.a($$5.b());

               try (Reader $$6 = $$5.e()) {
                  $$1.a("parse");
                  Map<String, gkf> $$7 = avx.a(g, $$6, h);
                  $$1.b("register");

                  for (Entry<String, gkf> $$8 : $$7.entrySet()) {
                     $$2.a(new aiy($$3, $$8.getKey()), $$8.getValue());
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

   protected void a(gll.a $$0, asa $$1, bil $$2) {
      $$0.a(this.i, this.k, this.j);
      if (aa.aU) {
         for (aiy $$3 : this.i.keySet()) {
            glm $$4 = this.i.get($$3);
            if (!vt.b($$4.a()) && kf.b.d($$3)) {
               e.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (e.isDebugEnabled()) {
         for (aiy $$5 : this.i.keySet()) {
            if (!kf.b.d($$5)) {
               e.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.j.a();
   }

   public List<String> a() {
      return this.j.h();
   }

   public epx b() {
      return this.j.i();
   }

   static boolean a(gke $$0, aiy $$1, asd $$2) {
      aiy $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         e.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public glm a(aiy $$0) {
      return this.i.get($$0);
   }

   public Collection<aiy> d() {
      return this.i.keySet();
   }

   public void a(gki $$0) {
      this.j.a($$0);
   }

   public void a(gkh $$0) {
      this.j.c($$0);
   }

   public void a(gkh $$0, int $$1) {
      this.j.a($$0, $$1);
   }

   public void a(ews $$0) {
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

   public void a(atl $$0, float $$1) {
      if ($$0 == atl.a && $$1 <= 0.0F) {
         this.f();
      }

      this.j.a($$0, $$1);
   }

   public void b(gkh $$0) {
      this.j.a($$0);
   }

   public boolean c(gkh $$0) {
      return this.j.b($$0);
   }

   public void a(glk $$0) {
      this.j.a($$0);
   }

   public void b(glk $$0) {
      this.j.b($$0);
   }

   public void a(@Nullable aiy $$0, @Nullable atl $$1) {
      this.j.a($$0, $$1);
   }

   public String j() {
      return this.j.g();
   }

   public void k() {
      this.j.a();
   }

   protected static class a {
      final Map<aiy, glm> a = Maps.newHashMap();
      private Map<aiy, ary> b = Map.of();

      void a(asa $$0) {
         this.b = gke.a.a($$0);
      }

      void a(aiy $$0, gkf $$1) {
         glm $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               gll.e.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new glm($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         asd $$4 = asd.fromMap(this.b);

         for (final gke $$5 : $$1.a()) {
            final aiy $$6 = $$5.a();
            gln<gke> $$8;
            switch ($$5.f()) {
               case a:
                  if (!gll.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new gln<gke>() {
                     @Override
                     public int e() {
                        glm $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public gke a(awo $$0) {
                        glm $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return gll.a;
                        } else {
                           gke $$2 = $$1.a($$0);
                           return new gke(
                              $$2.a().toString(), new blb($$2.c(), $$5.c()), new blb($$2.d(), $$5.d()), $$5.e(), gke.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i()
                           );
                        }
                     }

                     @Override
                     public void a(gli $$0) {
                        glm $$1 = a.this.a.get($$6);
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

      public void a(Map<aiy, glm> $$0, Map<aiy, ary> $$1, gli $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<aiy, glm> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
