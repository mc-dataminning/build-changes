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

public class gqa extends ath<gqa.a> {
   public static final got a = new got("minecraft:empty", bnb.a(1.0F), bnb.a(1.0F), 1, got.a.a, false, false, 16);
   public static final ajt b = new ajt("minecraft", "intentionally_empty");
   public static final gqb c = new gqb(b, null);
   public static final got d = new got(b.toString(), bnb.a(1.0F), bnb.a(1.0F), 1, got.a.a, false, false, 16);
   static final Logger e = LogUtils.getLogger();
   private static final String f = "sounds.json";
   private static final Gson g = new GsonBuilder().registerTypeHierarchyAdapter(wg.class, new wg.b(iz.b)).registerTypeAdapter(gou.class, new gov()).create();
   private static final TypeToken<Map<String, gou>> h = new TypeToken<Map<String, gou>>() {
   };
   private final Map<ajt, gqb> i = Maps.newHashMap();
   private final gpx j;
   private final Map<ajt, ata> k = new HashMap<>();

   public gqa(fbt $$0) {
      this.j = new gpx(this, $$0, atf.fromMap(this.k));
   }

   protected gqa.a a(atc $$0, bko $$1) {
      gqa.a $$2 = new gqa.a();
      $$1.a();
      $$1.a("list");
      $$2.a($$0);
      $$1.c();

      for (String $$3 : $$0.a()) {
         $$1.a($$3);

         try {
            for (ata $$5 : $$0.a(new ajt($$3, "sounds.json"))) {
               $$1.a($$5.b());

               try (Reader $$6 = $$5.e()) {
                  $$1.a("parse");
                  Map<String, gou> $$7 = axa.a(g, $$6, h);
                  $$1.b("register");

                  for (Entry<String, gou> $$8 : $$7.entrySet()) {
                     $$2.a(new ajt($$3, $$8.getKey()), $$8.getValue());
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

   protected void a(gqa.a $$0, atc $$1, bko $$2) {
      $$0.a(this.i, this.k, this.j);
      if (aa.aW) {
         for (ajt $$3 : this.i.keySet()) {
            gqb $$4 = this.i.get($$3);
            if (!wj.b($$4.a()) && kr.b.d($$3)) {
               e.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (e.isDebugEnabled()) {
         for (ajt $$5 : this.i.keySet()) {
            if (!kr.b.d($$5)) {
               e.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.j.a();
   }

   public List<String> a() {
      return this.j.h();
   }

   public euf b() {
      return this.j.i();
   }

   static boolean a(got $$0, ajt $$1, atf $$2) {
      ajt $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         e.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public gqb a(ajt $$0) {
      return this.i.get($$0);
   }

   public Collection<ajt> d() {
      return this.i.keySet();
   }

   public void a(gox $$0) {
      this.j.a($$0);
   }

   public void a(gow $$0) {
      this.j.c($$0);
   }

   public void a(gow $$0, int $$1) {
      this.j.a($$0, $$1);
   }

   public void a(fba $$0) {
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

   public void a(aun $$0, float $$1) {
      if ($$0 == aun.a && $$1 <= 0.0F) {
         this.f();
      }

      this.j.a($$0, $$1);
   }

   public void b(gow $$0) {
      this.j.a($$0);
   }

   public boolean c(gow $$0) {
      return this.j.b($$0);
   }

   public void a(gpz $$0) {
      this.j.a($$0);
   }

   public void b(gpz $$0) {
      this.j.b($$0);
   }

   public void a(@Nullable ajt $$0, @Nullable aun $$1) {
      this.j.a($$0, $$1);
   }

   public String j() {
      return this.j.g();
   }

   public void k() {
      this.j.a();
   }

   protected static class a {
      final Map<ajt, gqb> a = Maps.newHashMap();
      private Map<ajt, ata> b = Map.of();

      void a(atc $$0) {
         this.b = got.a.a($$0);
      }

      void a(ajt $$0, gou $$1) {
         gqb $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               gqa.e.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new gqb($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         atf $$4 = atf.fromMap(this.b);

         for (final got $$5 : $$1.a()) {
            final ajt $$6 = $$5.a();
            gqc<got> $$8;
            switch ($$5.f()) {
               case a:
                  if (!gqa.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new gqc<got>() {
                     @Override
                     public int e() {
                        gqb $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public got a(axr $$0) {
                        gqb $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return gqa.a;
                        } else {
                           got $$2 = $$1.a($$0);
                           return new got(
                              $$2.a().toString(), new bnh($$2.c(), $$5.c()), new bnh($$2.d(), $$5.d()), $$5.e(), got.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i()
                           );
                        }
                     }

                     @Override
                     public void a(gpx $$0) {
                        gqb $$1 = a.this.a.get($$6);
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

      public void a(Map<ajt, gqb> $$0, Map<ajt, ata> $$1, gpx $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<ajt, gqb> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
