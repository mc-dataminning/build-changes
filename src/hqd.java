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

public class hqd extends avk<hqd.a> {
   public static final ali a = ali.b("empty");
   public static final hou b = new hou(a, bts.a(1.0F), bts.a(1.0F), 1, hou.a.a, false, false, 16);
   public static final ali c = ali.b("intentionally_empty");
   public static final hqe d = new hqe(c, null);
   public static final hou e = new hou(c, bts.a(1.0F), bts.a(1.0F), 1, hou.a.a, false, false, 16);
   static final Logger f = LogUtils.getLogger();
   private static final String g = "sounds.json";
   private static final Gson h = new GsonBuilder().registerTypeHierarchyAdapter(xa.class, new xa.b(jt.b)).registerTypeAdapter(hov.class, new how()).create();
   private static final TypeToken<Map<String, hov>> i = new TypeToken<Map<String, hov>>() {
   };
   private final Map<ali, hqe> j = Maps.newHashMap();
   private final hqa k;
   private final Map<ali, avd> l = new HashMap<>();

   public hqd(frh $$0) {
      this.k = new hqa(this, $$0, avi.fromMap(this.l));
   }

   protected hqd.a a(avf $$0, brb $$1) {
      hqd.a $$2 = new hqd.a();

      try (brg $$3 = $$1.d("list")) {
         $$2.a($$0);
      }

      for (String $$4 : $$0.a()) {
         try (brg $$5 = $$1.d($$4)) {
            for (avd $$7 : $$0.a(ali.a($$4, "sounds.json"))) {
               $$1.a($$7.b());

               try (Reader $$8 = $$7.e()) {
                  $$1.a("parse");
                  Map<String, hov> $$9 = aze.a(h, $$8, i);
                  $$1.b("register");

                  for (Entry<String, hov> $$10 : $$9.entrySet()) {
                     $$2.a(ali.a($$4, $$10.getKey()), $$10.getValue());
                  }

                  $$1.c();
               } catch (RuntimeException var19) {
                  f.warn("Invalid {} in resourcepack: '{}'", new Object[]{"sounds.json", $$7.b(), var19});
               }

               $$1.c();
            }
         } catch (IOException var21) {
         }
      }

      return $$2;
   }

   protected void a(hqd.a $$0, avf $$1, brb $$2) {
      $$0.a(this.j, this.l, this.k);
      if (ac.aU) {
         for (ali $$3 : this.j.keySet()) {
            hqe $$4 = this.j.get($$3);
            if (!xd.b($$4.a()) && mg.b.d($$3)) {
               f.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (f.isDebugEnabled()) {
         for (ali $$5 : this.j.keySet()) {
            if (!mg.b.d($$5)) {
               f.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.k.a();
   }

   public List<String> a() {
      return this.k.h();
   }

   public fia b() {
      return this.k.i();
   }

   static boolean a(hou $$0, ali $$1, avi $$2) {
      ali $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         f.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public hqe a(ali $$0) {
      return this.j.get($$0);
   }

   public Collection<ali> c() {
      return this.j.keySet();
   }

   public void a(hoy $$0) {
      this.k.a($$0);
   }

   public void a(hox $$0) {
      this.k.c($$0);
   }

   public void a(hox $$0, int $$1) {
      this.k.a($$0, $$1);
   }

   public void a(fql $$0) {
      this.k.a($$0);
   }

   public void d() {
      this.k.e();
   }

   public void e() {
      this.k.d();
   }

   public void f() {
      this.k.b();
   }

   public void g() {
      this.k.c();
   }

   public void a(boolean $$0) {
      this.k.a($$0);
   }

   public void h() {
      this.k.f();
   }

   public void a(awq $$0, float $$1) {
      if ($$0 == awq.a && $$1 <= 0.0F) {
         this.e();
      }

      this.k.a($$0, $$1);
   }

   public void b(hox $$0) {
      this.k.a($$0);
   }

   public void a(hox $$0, float $$1) {
      this.k.a($$0, $$1);
   }

   public boolean c(hox $$0) {
      return this.k.b($$0);
   }

   public void a(hqc $$0) {
      this.k.a($$0);
   }

   public void b(hqc $$0) {
      this.k.b($$0);
   }

   public void a(@Nullable ali $$0, @Nullable awq $$1) {
      this.k.a($$0, $$1);
   }

   public String i() {
      return this.k.g();
   }

   public void j() {
      this.k.a();
   }

   protected static class a {
      final Map<ali, hqe> a = Maps.newHashMap();
      private Map<ali, avd> b = Map.of();

      void a(avf $$0) {
         this.b = hou.a.a($$0);
      }

      void a(ali $$0, hov $$1) {
         hqe $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               hqd.f.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new hqe($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         avi $$4 = avi.fromMap(this.b);

         for (final hou $$5 : $$1.a()) {
            final ali $$6 = $$5.a();
            hqf<hou> $$8;
            switch ($$5.f()) {
               case a:
                  if (!hqd.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new hqf<hou>() {
                     @Override
                     public int e() {
                        hqe $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public hou a(azx $$0) {
                        hqe $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return hqd.b;
                        } else {
                           hou $$2 = $$1.a($$0);
                           return new hou($$2.a(), new bty($$2.c(), $$5.c()), new bty($$2.d(), $$5.d()), $$5.e(), hou.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i());
                        }
                     }

                     @Override
                     public void a(hqa $$0) {
                        hqe $$1 = a.this.a.get($$6);
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

      public void a(Map<ali, hqe> $$0, Map<ali, avd> $$1, hqa $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<ali, hqe> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
