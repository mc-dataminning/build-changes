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

public class hca extends auz<hca.a> {
   public static final alc a = alc.b("empty");
   public static final has b = new has(a, bqq.a(1.0F), bqq.a(1.0F), 1, has.a.a, false, false, 16);
   public static final alc c = alc.b("intentionally_empty");
   public static final hcb d = new hcb(c, null);
   public static final has e = new has(c, bqq.a(1.0F), bqq.a(1.0F), 1, has.a.a, false, false, 16);
   static final Logger f = LogUtils.getLogger();
   private static final String g = "sounds.json";
   private static final Gson h = new GsonBuilder().registerTypeHierarchyAdapter(xd.class, new xd.b(kb.b)).registerTypeAdapter(hat.class, new hau()).create();
   private static final TypeToken<Map<String, hat>> i = new TypeToken<Map<String, hat>>() {
   };
   private final Map<alc, hcb> j = Maps.newHashMap();
   private final hbx k;
   private final Map<alc, aur> l = new HashMap<>();

   public hca(fip $$0) {
      this.k = new hbx(this, $$0, auw.fromMap(this.l));
   }

   protected hca.a a(aut $$0, bod $$1) {
      hca.a $$2 = new hca.a();
      $$1.a();
      $$1.a("list");
      $$2.a($$0);
      $$1.c();

      for (String $$3 : $$0.a()) {
         $$1.a($$3);

         try {
            for (aur $$5 : $$0.a(alc.a($$3, "sounds.json"))) {
               $$1.a($$5.b());

               try (Reader $$6 = $$5.e()) {
                  $$1.a("parse");
                  Map<String, hat> $$7 = ayt.a(h, $$6, i);
                  $$1.b("register");

                  for (Entry<String, hat> $$8 : $$7.entrySet()) {
                     $$2.a(alc.a($$3, $$8.getKey()), $$8.getValue());
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

   protected void a(hca.a $$0, aut $$1, bod $$2) {
      $$0.a(this.j, this.l, this.k);
      if (ab.aW) {
         for (alc $$3 : this.j.keySet()) {
            hcb $$4 = this.j.get($$3);
            if (!xg.b($$4.a()) && lu.b.d($$3)) {
               f.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (f.isDebugEnabled()) {
         for (alc $$5 : this.j.keySet()) {
            if (!lu.b.d($$5)) {
               f.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.k.a();
   }

   public List<String> a() {
      return this.k.h();
   }

   public fay b() {
      return this.k.i();
   }

   static boolean a(has $$0, alc $$1, auw $$2) {
      alc $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         f.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public hcb a(alc $$0) {
      return this.j.get($$0);
   }

   public Collection<alc> d() {
      return this.j.keySet();
   }

   public void a(haw $$0) {
      this.k.a($$0);
   }

   public void a(hav $$0) {
      this.k.c($$0);
   }

   public void a(hav $$0, int $$1) {
      this.k.a($$0, $$1);
   }

   public void a(fhu $$0) {
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

   public void a(awf $$0, float $$1) {
      if ($$0 == awf.a && $$1 <= 0.0F) {
         this.f();
      }

      this.k.a($$0, $$1);
   }

   public void b(hav $$0) {
      this.k.a($$0);
   }

   public boolean c(hav $$0) {
      return this.k.b($$0);
   }

   public void a(hbz $$0) {
      this.k.a($$0);
   }

   public void b(hbz $$0) {
      this.k.b($$0);
   }

   public void a(@Nullable alc $$0, @Nullable awf $$1) {
      this.k.a($$0, $$1);
   }

   public String j() {
      return this.k.g();
   }

   public void k() {
      this.k.a();
   }

   protected static class a {
      final Map<alc, hcb> a = Maps.newHashMap();
      private Map<alc, aur> b = Map.of();

      void a(aut $$0) {
         this.b = has.a.a($$0);
      }

      void a(alc $$0, hat $$1) {
         hcb $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               hca.f.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new hcb($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         auw $$4 = auw.fromMap(this.b);

         for (final has $$5 : $$1.a()) {
            final alc $$6 = $$5.a();
            hcc<has> $$8;
            switch ($$5.f()) {
               case a:
                  if (!hca.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new hcc<has>() {
                     @Override
                     public int e() {
                        hcb $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public has a(azl $$0) {
                        hcb $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return hca.b;
                        } else {
                           has $$2 = $$1.a($$0);
                           return new has($$2.a(), new bqw($$2.c(), $$5.c()), new bqw($$2.d(), $$5.d()), $$5.e(), has.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i());
                        }
                     }

                     @Override
                     public void a(hbx $$0) {
                        hcb $$1 = a.this.a.get($$6);
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

      public void a(Map<alc, hcb> $$0, Map<alc, aur> $$1, hbx $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<alc, hcb> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
