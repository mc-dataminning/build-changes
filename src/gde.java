import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class gde implements zw {
   private static final xj k = xj.c("disconnect.lost");
   private static final Logger l = LogUtils.getLogger();
   protected final fke a;
   protected final wd b;
   @Nullable
   protected final gdv c;
   @Nullable
   protected String d;
   protected final het e;
   @Nullable
   protected final frw f;
   protected boolean g;
   private final List<gde.a> m = new ArrayList<>();
   protected final Map<alj, byte[]> h;
   protected Map<String, String> i;
   protected amb j;

   protected gde(fke $$0, wd $$1, gdl $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.f();
      this.d = $$2.e();
      this.e = $$2.b();
      this.f = $$2.g();
      this.h = $$2.h();
      this.i = $$2.j();
      this.j = $$2.k();
   }

   @Override
   public void a(zq $$0, Exception $$1) {
      l.error("Failed to handle packet {}, disconnecting", $$0, $$1);
      zw.super.a($$0, $$1);
      Optional<Path> $$2 = this.a($$0, (Throwable)$$1);
      Optional<URI> $$3 = this.j.a(amb.b.a).map(amb.a::c);
      this.b.a(new wf(xj.c("disconnect.packetError"), $$2, $$3));
   }

   @Override
   public wf a(xj $$0, Throwable $$1) {
      Optional<Path> $$2 = this.a(null, $$1);
      Optional<URI> $$3 = this.j.a(amb.b.a).map(amb.a::c);
      return new wf($$0, $$2, $$3);
   }

   private Optional<Path> a(@Nullable zq $$0, Throwable $$1) {
      o $$2 = o.a($$1, "Packet handling error");
      zt.a($$2, this, $$0);
      Path $$3 = this.a.q.toPath().resolve("debug");
      Path $$4 = $$3.resolve("disconnect-" + ae.f() + "-client.txt");
      Optional<amb.a> $$5 = this.j.a(amb.b.a);
      List<String> $$6 = $$5.<List<String>>map($$0x -> List.of("Server bug reporting link: " + $$0x.c())).orElse(List.of());
      return $$2.a($$4, y.d, $$6) ? Optional.of($$4) : Optional.empty();
   }

   @Override
   public boolean a(zq<?> $$0) {
      return zw.super.a($$0) ? true : this.g && ($$0 instanceof aaf || $$0 instanceof aag);
   }

   @Override
   public void a(aaa $$0) {
      this.a(new aam($$0.b()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(aab $$0) {
      zt.a($$0, this, this.a);
      this.b(new aan($$0.b()));
   }

   @Override
   public void a(zx $$0) {
      aat $$1 = $$0.b();
      if (!($$1 instanceof aau)) {
         zt.a($$0, this, this.a);
         if ($$1 instanceof aar $$2) {
            this.d = $$2.b();
            this.e.a($$2.b());
         } else {
            this.a($$1);
         }
      }
   }

   protected abstract void a(aat var1);

   @Override
   public void a(aad $$0) {
      zt.a($$0, this, this.a);
      UUID $$1 = $$0.b();
      URL $$2 = a($$0.e());
      if ($$2 == null) {
         this.b.a(new aao($$1, aao.a.f));
      } else {
         String $$3 = $$0.f();
         boolean $$4 = $$0.g();
         gdv.a $$5 = this.c != null ? this.c.b() : gdv.a.c;
         if ($$5 != gdv.a.c && (!$$4 || $$5 != gdv.a.b)) {
            this.a.af().a($$1, $$2, $$3);
         } else {
            this.a.a(this.a($$1, $$2, $$3, $$4, $$0.h().orElse(null)));
         }
      }
   }

   @Override
   public void a(aac $$0) {
      zt.a($$0, this, this.a);
      $$0.b().ifPresentOrElse($$0x -> this.a.af().a($$0x), () -> this.a.af().e());
   }

   static xj a(xj $$0, @Nullable xj $$1) {
      return (xj)($$1 == null ? $$0 : xj.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
   }

   @Nullable
   private static URL a(String $$0) {
      try {
         URL $$1 = new URL($$0);
         String $$2 = $$1.getProtocol();
         return !"http".equals($$2) && !"https".equals($$2) ? null : $$1;
      } catch (MalformedURLException var3) {
         return null;
      }
   }

   @Override
   public void a(aca $$0) {
      zt.a($$0, this, this.a);
      this.b.a(new acd($$0.b(), this.h.get($$0.b())));
   }

   @Override
   public void a(aaf $$0) {
      zt.a($$0, this, this.a);
      this.h.put($$0.b(), $$0.e());
   }

   @Override
   public void a(zy $$0) {
      zt.a($$0, this, this.a);
      this.i = $$0.b();
   }

   @Override
   public void a(aae $$0) {
      zt.a($$0, this, this.a);
      List<amb.c> $$1 = $$0.b();
      Builder<amb.a> $$2 = ImmutableList.builderWithExpectedSize($$1.size());

      for (amb.c $$3 : $$1) {
         try {
            URI $$4 = ae.a($$3.b());
            $$2.add(new amb.a($$3.a(), $$4));
         } catch (Exception var7) {
            l.warn("Received invalid link for type {}:{}", new Object[]{$$3.a(), $$3.b(), var7});
         }
      }

      this.j = new amb($$2.build());
   }

   @Override
   public void a(aag $$0) {
      this.g = true;
      zt.a($$0, this, this.a);
      if (this.c == null) {
         throw new IllegalStateException("Cannot transfer to server from singleplayer");
      } else {
         this.b.a(xj.c("disconnect.transfer"));
         this.b.m();
         this.b.n();
         gey $$1 = new gey($$0.b(), $$0.e());
         fqv.a(Objects.requireNonNullElseGet(this.f, fry::new), this.a, $$1, this.c, false, new gdz(this.h));
      }
   }

   @Override
   public void a(zz $$0) {
      this.b.a($$0.b());
   }

   protected void e() {
      Iterator<gde.a> $$0 = this.m.iterator();

      while ($$0.hasNext()) {
         gde.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= ae.c()) {
            $$0.remove();
         }
      }
   }

   public void b(zq<?> $$0) {
      this.b.a($$0);
   }

   @Override
   public void a(wf $$0) {
      this.e.c();
      this.a.a(this.b($$0), this.g);
      l.warn("Client disconnected with reason: {}", $$0.a().getString());
   }

   @Override
   public void a(o $$0, p $$1) {
      $$1.a("Server type", () -> this.c != null ? this.c.f().toString() : "<none>");
      $$1.a("Server brand", () -> this.d);
      if (!this.i.isEmpty()) {
         p $$2 = $$0.a("Custom Server Details");
         this.i.forEach($$2::a);
      }
   }

   protected frw b(wf $$0) {
      frw $$1 = Objects.requireNonNullElseGet(this.f, () -> new fum(new fry()));
      return (frw)(this.c != null && this.c.e() ? new hfm($$1, k, $$0.a()) : new frd($$1, k, $$0));
   }

   @Nullable
   public String f() {
      return this.d;
   }

   private void a(zq<? extends wv> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.m.add(new gde.a($$0, $$1, ae.c() + $$2.toMillis()));
      }
   }

   private frw a(UUID $$0, URL $$1, String $$2, boolean $$3, @Nullable xj $$4) {
      frw $$5 = this.a.z;
      return $$5 instanceof gde.b $$6 ? $$6.a(this.a, $$0, $$1, $$2, $$3, $$4) : new gde.b(this.a, $$5, List.of(new gde.b.a($$0, $$1, $$2)), $$3, $$4);
   }

   static record a(zq<? extends wv> a, BooleanSupplier b, long c) {
   }

   class b extends fqu {
      private final List<gde.b.a> s;
      @Nullable
      private final frw u;

      b(final fke $$0, @Nullable final frw $$1, final List<gde.b.a> $$2, final boolean $$3, @Nullable final xj $$4) {
         super(
            $$5 -> {
               $$0.a($$1);
               hcd $$6 = $$0.af();
               if ($$5) {
                  if (gde.this.c != null) {
                     gde.this.c.a(gdv.a.a);
                  }

                  $$6.g();
               } else {
                  $$6.h();
                  if ($$3) {
                     gde.this.b.a(xj.c("multiplayer.requiredTexturePrompt.disconnect"));
                  } else if (gde.this.c != null) {
                     gde.this.c.a(gdv.a.b);
                  }
               }

               for (gde.b.a $$7 : $$2) {
                  $$6.a($$7.a, $$7.b, $$7.c);
               }

               if (gde.this.c != null) {
                  gdw.b(gde.this.c);
               }
            },
            $$3 ? xj.c("multiplayer.requiredTexturePrompt.line1") : xj.c("multiplayer.texturePrompt.line1"),
            gde.a($$3 ? xj.c("multiplayer.requiredTexturePrompt.line2").a(n.o, n.r) : xj.c("multiplayer.texturePrompt.line2"), $$4),
            $$3 ? xi.i : xi.f,
            $$3 ? xi.p : xi.g
         );
         this.s = $$2;
         this.u = $$1;
      }

      public gde.b a(fke $$0, UUID $$1, URL $$2, String $$3, boolean $$4, @Nullable xj $$5) {
         List<gde.b.a> $$6 = ImmutableList.builderWithExpectedSize(this.s.size() + 1).addAll(this.s).add(new gde.b.a($$1, $$2, $$3)).build();
         return gde.this.new b($$0, this.u, $$6, $$4, $$5);
      }

      static record a(UUID a, URL b, String c) {
      }
   }
}
