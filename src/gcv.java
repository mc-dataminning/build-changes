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

public abstract class gcv implements zy {
   private static final xl k = xl.c("disconnect.lost");
   private static final Logger l = LogUtils.getLogger();
   protected final fjx a;
   protected final wf b;
   @Nullable
   protected final gdm c;
   @Nullable
   protected String d;
   protected final hei e;
   @Nullable
   protected final frp f;
   protected boolean g;
   private final List<gcv.a> m = new ArrayList<>();
   protected final Map<all, byte[]> h;
   protected Map<String, String> i;
   protected amd j;

   protected gcv(fjx $$0, wf $$1, gdc $$2) {
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
   public void a(zs $$0, Exception $$1) {
      l.error("Failed to handle packet {}, disconnecting", $$0, $$1);
      zy.super.a($$0, $$1);
      Optional<Path> $$2 = this.a($$0, (Throwable)$$1);
      Optional<URI> $$3 = this.j.a(amd.b.a).map(amd.a::c);
      this.b.a(new wh(xl.c("disconnect.packetError"), $$2, $$3));
   }

   @Override
   public wh a(xl $$0, Throwable $$1) {
      Optional<Path> $$2 = this.a(null, $$1);
      Optional<URI> $$3 = this.j.a(amd.b.a).map(amd.a::c);
      return new wh($$0, $$2, $$3);
   }

   private Optional<Path> a(@Nullable zs $$0, Throwable $$1) {
      o $$2 = o.a($$1, "Packet handling error");
      zv.a($$2, this, $$0);
      Path $$3 = this.a.q.toPath().resolve("debug");
      Path $$4 = $$3.resolve("disconnect-" + ae.f() + "-client.txt");
      Optional<amd.a> $$5 = this.j.a(amd.b.a);
      List<String> $$6 = $$5.<List<String>>map($$0x -> List.of("Server bug reporting link: " + $$0x.c())).orElse(List.of());
      return $$2.a($$4, y.d, $$6) ? Optional.of($$4) : Optional.empty();
   }

   @Override
   public boolean a(zs<?> $$0) {
      return zy.super.a($$0) ? true : this.g && ($$0 instanceof aah || $$0 instanceof aai);
   }

   @Override
   public void a(aac $$0) {
      this.a(new aao($$0.b()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(aad $$0) {
      zv.a($$0, this, this.a);
      this.b(new aap($$0.b()));
   }

   @Override
   public void a(zz $$0) {
      aav $$1 = $$0.b();
      if (!($$1 instanceof aaw)) {
         zv.a($$0, this, this.a);
         if ($$1 instanceof aat $$2) {
            this.d = $$2.b();
            this.e.a($$2.b());
         } else {
            this.a($$1);
         }
      }
   }

   protected abstract void a(aav var1);

   @Override
   public void a(aaf $$0) {
      zv.a($$0, this, this.a);
      UUID $$1 = $$0.b();
      URL $$2 = a($$0.e());
      if ($$2 == null) {
         this.b.a(new aaq($$1, aaq.a.f));
      } else {
         String $$3 = $$0.f();
         boolean $$4 = $$0.g();
         gdm.a $$5 = this.c != null ? this.c.b() : gdm.a.c;
         if ($$5 != gdm.a.c && (!$$4 || $$5 != gdm.a.b)) {
            this.a.af().a($$1, $$2, $$3);
         } else {
            this.a.a(this.a($$1, $$2, $$3, $$4, $$0.h().orElse(null)));
         }
      }
   }

   @Override
   public void a(aae $$0) {
      zv.a($$0, this, this.a);
      $$0.b().ifPresentOrElse($$0x -> this.a.af().a($$0x), () -> this.a.af().e());
   }

   static xl a(xl $$0, @Nullable xl $$1) {
      return (xl)($$1 == null ? $$0 : xl.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
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
   public void a(acc $$0) {
      zv.a($$0, this, this.a);
      this.b.a(new acf($$0.b(), this.h.get($$0.b())));
   }

   @Override
   public void a(aah $$0) {
      zv.a($$0, this, this.a);
      this.h.put($$0.b(), $$0.e());
   }

   @Override
   public void a(aaa $$0) {
      zv.a($$0, this, this.a);
      this.i = $$0.b();
   }

   @Override
   public void a(aag $$0) {
      zv.a($$0, this, this.a);
      List<amd.c> $$1 = $$0.b();
      Builder<amd.a> $$2 = ImmutableList.builderWithExpectedSize($$1.size());

      for (amd.c $$3 : $$1) {
         try {
            URI $$4 = ae.a($$3.b());
            $$2.add(new amd.a($$3.a(), $$4));
         } catch (Exception var7) {
            l.warn("Received invalid link for type {}:{}", new Object[]{$$3.a(), $$3.b(), var7});
         }
      }

      this.j = new amd($$2.build());
   }

   @Override
   public void a(aai $$0) {
      this.g = true;
      zv.a($$0, this, this.a);
      if (this.c == null) {
         throw new IllegalStateException("Cannot transfer to server from singleplayer");
      } else {
         this.b.a(xl.c("disconnect.transfer"));
         this.b.m();
         this.b.n();
         gep $$1 = new gep($$0.b(), $$0.e());
         fqo.a(Objects.requireNonNullElseGet(this.f, frr::new), this.a, $$1, this.c, false, new gdq(this.h));
      }
   }

   @Override
   public void a(aab $$0) {
      this.b.a($$0.b());
   }

   protected void e() {
      Iterator<gcv.a> $$0 = this.m.iterator();

      while ($$0.hasNext()) {
         gcv.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= ae.c()) {
            $$0.remove();
         }
      }
   }

   public void b(zs<?> $$0) {
      this.b.a($$0);
   }

   @Override
   public void a(wh $$0) {
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

   protected frp b(wh $$0) {
      frp $$1 = Objects.requireNonNullElseGet(this.f, () -> new fue(new frr()));
      return (frp)(this.c != null && this.c.e() ? new hfb($$1, k, $$0.a()) : new fqw($$1, k, $$0));
   }

   @Nullable
   public String f() {
      return this.d;
   }

   private void a(zs<? extends wx> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.m.add(new gcv.a($$0, $$1, ae.c() + $$2.toMillis()));
      }
   }

   private frp a(UUID $$0, URL $$1, String $$2, boolean $$3, @Nullable xl $$4) {
      frp $$5 = this.a.z;
      return $$5 instanceof gcv.b $$6 ? $$6.a(this.a, $$0, $$1, $$2, $$3, $$4) : new gcv.b(this.a, $$5, List.of(new gcv.b.a($$0, $$1, $$2)), $$3, $$4);
   }

   static record a(zs<? extends wx> a, BooleanSupplier b, long c) {
   }

   class b extends fqn {
      private final List<gcv.b.a> s;
      @Nullable
      private final frp u;

      b(final fjx $$0, @Nullable final frp $$1, final List<gcv.b.a> $$2, final boolean $$3, @Nullable final xl $$4) {
         super(
            $$5 -> {
               $$0.a($$1);
               hbs $$6 = $$0.af();
               if ($$5) {
                  if (gcv.this.c != null) {
                     gcv.this.c.a(gdm.a.a);
                  }

                  $$6.g();
               } else {
                  $$6.h();
                  if ($$3) {
                     gcv.this.b.a(xl.c("multiplayer.requiredTexturePrompt.disconnect"));
                  } else if (gcv.this.c != null) {
                     gcv.this.c.a(gdm.a.b);
                  }
               }

               for (gcv.b.a $$7 : $$2) {
                  $$6.a($$7.a, $$7.b, $$7.c);
               }

               if (gcv.this.c != null) {
                  gdn.b(gcv.this.c);
               }
            },
            $$3 ? xl.c("multiplayer.requiredTexturePrompt.line1") : xl.c("multiplayer.texturePrompt.line1"),
            gcv.a($$3 ? xl.c("multiplayer.requiredTexturePrompt.line2").a(n.o, n.r) : xl.c("multiplayer.texturePrompt.line2"), $$4),
            $$3 ? xk.i : xk.f,
            $$3 ? xk.p : xk.g
         );
         this.s = $$2;
         this.u = $$1;
      }

      public gcv.b a(fjx $$0, UUID $$1, URL $$2, String $$3, boolean $$4, @Nullable xl $$5) {
         List<gcv.b.a> $$6 = ImmutableList.builderWithExpectedSize(this.s.size() + 1).addAll(this.s).add(new gcv.b.a($$1, $$2, $$3)).build();
         return gcv.this.new b($$0, this.u, $$6, $$4, $$5);
      }

      static record a(UUID a, URL b, String c) {
      }
   }
}
