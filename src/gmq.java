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

public class gmq extends ask<gmq.a> {
   public static final glj a = new glj("minecraft:empty", blm.a(1.0F), blm.a(1.0F), 1, glj.a.a, false, false, 16);
   public static final ajc b = new ajc("minecraft", "intentionally_empty");
   public static final gmr c = new gmr(b, null);
   public static final glj d = new glj(b.toString(), blm.a(1.0F), blm.a(1.0F), 1, glj.a.a, false, false, 16);
   static final Logger e = LogUtils.getLogger();
   private static final String f = "sounds.json";
   private static final Gson g = new GsonBuilder().registerTypeHierarchyAdapter(vs.class, new vs.b()).registerTypeAdapter(glk.class, new gll()).create();
   private static final TypeToken<Map<String, glk>> h = new TypeToken<Map<String, glk>>() {
   };
   private final Map<ajc, gmr> i = Maps.newHashMap();
   private final gmn j;
   private final Map<ajc, asd> k = new HashMap<>();

   public gmq(eyo $$0) {
      this.j = new gmn(this, $$0, asi.fromMap(this.k));
   }

   protected gmq.a a(asf $$0, bjc $$1) {
      gmq.a $$2 = new gmq.a();
      $$1.a();
      $$1.a("list");
      $$2.a($$0);
      $$1.c();

      for (String $$3 : $$0.a()) {
         $$1.a($$3);

         try {
            for (asd $$5 : $$0.a(new ajc($$3, "sounds.json"))) {
               $$1.a($$5.b());

               try (Reader $$6 = $$5.e()) {
                  $$1.a("parse");
                  Map<String, glk> $$7 = awc.a(g, $$6, h);
                  $$1.b("register");

                  for (Entry<String, glk> $$8 : $$7.entrySet()) {
                     $$2.a(new ajc($$3, $$8.getKey()), $$8.getValue());
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

   protected void a(gmq.a $$0, asf $$1, bjc $$2) {
      $$0.a(this.i, this.k, this.j);
      if (aa.aV) {
         for (ajc $$3 : this.i.keySet()) {
            gmr $$4 = this.i.get($$3);
            if (!vv.b($$4.a()) && kh.b.d($$3)) {
               e.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (e.isDebugEnabled()) {
         for (ajc $$5 : this.i.keySet()) {
            if (!kh.b.d($$5)) {
               e.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.j.a();
   }

   public List<String> a() {
      return this.j.h();
   }

   public era b() {
      return this.j.i();
   }

   static boolean a(glj $$0, ajc $$1, asi $$2) {
      ajc $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         e.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public gmr a(ajc $$0) {
      return this.i.get($$0);
   }

   public Collection<ajc> d() {
      return this.i.keySet();
   }

   public void a(gln $$0) {
      this.j.a($$0);
   }

   public void a(glm $$0) {
      this.j.c($$0);
   }

   public void a(glm $$0, int $$1) {
      this.j.a($$0, $$1);
   }

   public void a(exv $$0) {
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

   public void a(atq $$0, float $$1) {
      if ($$0 == atq.a && $$1 <= 0.0F) {
         this.f();
      }

      this.j.a($$0, $$1);
   }

   public void b(glm $$0) {
      this.j.a($$0);
   }

   public boolean c(glm $$0) {
      return this.j.b($$0);
   }

   public void a(gmp $$0) {
      this.j.a($$0);
   }

   public void b(gmp $$0) {
      this.j.b($$0);
   }

   public void a(@Nullable ajc $$0, @Nullable atq $$1) {
      this.j.a($$0, $$1);
   }

   public String j() {
      return this.j.g();
   }

   public void k() {
      this.j.a();
   }

   protected static class a {
      final Map<ajc, gmr> a = Maps.newHashMap();
      private Map<ajc, asd> b = Map.of();

      void a(asf $$0) {
         this.b = glj.a.a($$0);
      }

      void a(ajc $$0, glk $$1) {
         gmr $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               gmq.e.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new gmr($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         asi $$4 = asi.fromMap(this.b);

         for (final glj $$5 : $$1.a()) {
            final ajc $$6 = $$5.a();
            gms<glj> $$8;
            switch ($$5.f()) {
               case a:
                  if (!gmq.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new gms<glj>() {
                     @Override
                     public int e() {
                        gmr $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public glj a(awt $$0) {
                        gmr $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return gmq.a;
                        } else {
                           glj $$2 = $$1.a($$0);
                           return new glj(
                              $$2.a().toString(), new bls($$2.c(), $$5.c()), new bls($$2.d(), $$5.d()), $$5.e(), glj.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i()
                           );
                        }
                     }

                     @Override
                     public void a(gmn $$0) {
                        gmr $$1 = a.this.a.get($$6);
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

      public void a(Map<ajc, gmr> $$0, Map<ajc, asd> $$1, gmn $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<ajc, gmr> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
