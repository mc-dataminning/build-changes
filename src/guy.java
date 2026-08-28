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

public class guy extends aui<guy.a> {
   public static final akq a = akq.b("empty");
   public static final gtq b = new gtq(a, bpr.a(1.0F), bpr.a(1.0F), 1, gtq.a.a, false, false, 16);
   public static final akq c = akq.b("intentionally_empty");
   public static final guz d = new guz(c, null);
   public static final gtq e = new gtq(c, bpr.a(1.0F), bpr.a(1.0F), 1, gtq.a.a, false, false, 16);
   static final Logger f = LogUtils.getLogger();
   private static final String g = "sounds.json";
   private static final Gson h = new GsonBuilder().registerTypeHierarchyAdapter(wy.class, new wy.b(ka.b)).registerTypeAdapter(gtr.class, new gts()).create();
   private static final TypeToken<Map<String, gtr>> i = new TypeToken<Map<String, gtr>>() {
   };
   private final Map<akq, guz> j = Maps.newHashMap();
   private final guv k;
   private final Map<akq, aub> l = new HashMap<>();

   public guy(fgm $$0) {
      this.k = new guv(this, $$0, aug.fromMap(this.l));
   }

   protected guy.a a(aud $$0, bne $$1) {
      guy.a $$2 = new guy.a();
      $$1.a();
      $$1.a("list");
      $$2.a($$0);
      $$1.c();

      for (String $$3 : $$0.a()) {
         $$1.a($$3);

         try {
            for (aub $$5 : $$0.a(akq.a($$3, "sounds.json"))) {
               $$1.a($$5.b());

               try (Reader $$6 = $$5.e()) {
                  $$1.a("parse");
                  Map<String, gtr> $$7 = ayd.a(h, $$6, i);
                  $$1.b("register");

                  for (Entry<String, gtr> $$8 : $$7.entrySet()) {
                     $$2.a(akq.a($$3, $$8.getKey()), $$8.getValue());
                  }

                  $$1.c();
               } catch (RuntimeException var15) {
                  f.warn("Invalid {} in resourcepack: '{}'", new Object[]{"sounds.json", $$5.b(), var15});
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

   protected void a(guy.a $$0, aud $$1, bne $$2) {
      $$0.a(this.j, this.l, this.k);
      if (ab.aV) {
         for (akq $$3 : this.j.keySet()) {
            guz $$4 = this.j.get($$3);
            if (!xb.b($$4.a()) && lt.b.d($$3)) {
               f.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (f.isDebugEnabled()) {
         for (akq $$5 : this.j.keySet()) {
            if (!lt.b.d($$5)) {
               f.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.k.a();
   }

   public List<String> a() {
      return this.k.h();
   }

   public ezb b() {
      return this.k.i();
   }

   static boolean a(gtq $$0, akq $$1, aug $$2) {
      akq $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         f.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public guz a(akq $$0) {
      return this.j.get($$0);
   }

   public Collection<akq> d() {
      return this.j.keySet();
   }

   public void a(gtu $$0) {
      this.k.a($$0);
   }

   public void a(gtt $$0) {
      this.k.c($$0);
   }

   public void a(gtt $$0, int $$1) {
      this.k.a($$0, $$1);
   }

   public void a(ffs $$0) {
      this.k.a($$0);
   }

   public void e() {
      this.k.e();
   }

   public void f() {
      this.k.d();
   }

   public void g() {
      this.k.b();
   }

   public void h() {
      this.k.c();
   }

   public void a(boolean $$0) {
      this.k.a($$0);
   }

   public void i() {
      this.k.f();
   }

   public void a(avp $$0, float $$1) {
      if ($$0 == avp.a && $$1 <= 0.0F) {
         this.f();
      }

      this.k.a($$0, $$1);
   }

   public void b(gtt $$0) {
      this.k.a($$0);
   }

   public boolean c(gtt $$0) {
      return this.k.b($$0);
   }

   public void a(gux $$0) {
      this.k.a($$0);
   }

   public void b(gux $$0) {
      this.k.b($$0);
   }

   public void a(@Nullable akq $$0, @Nullable avp $$1) {
      this.k.a($$0, $$1);
   }

   public String j() {
      return this.k.g();
   }

   public void k() {
      this.k.a();
   }

   protected static class a {
      final Map<akq, guz> a = Maps.newHashMap();
      private Map<akq, aub> b = Map.of();

      void a(aud $$0) {
         this.b = gtq.a.a($$0);
      }

      void a(akq $$0, gtr $$1) {
         guz $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               guy.f.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new guz($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         aug $$4 = aug.fromMap(this.b);

         for (final gtq $$5 : $$1.a()) {
            final akq $$6 = $$5.a();
            gva<gtq> $$8;
            switch ($$5.f()) {
               case a:
                  if (!guy.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new gva<gtq>() {
                     @Override
                     public int e() {
                        guz $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public gtq a(ayv $$0) {
                        guz $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return guy.b;
                        } else {
                           gtq $$2 = $$1.a($$0);
                           return new gtq($$2.a(), new bpx($$2.c(), $$5.c()), new bpx($$2.d(), $$5.d()), $$5.e(), gtq.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i());
                        }
                     }

                     @Override
                     public void a(guv $$0) {
                        guz $$1 = a.this.a.get($$6);
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

      public void a(Map<akq, guz> $$0, Map<akq, aub> $$1, guv $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<akq, guz> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
