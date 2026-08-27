import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record ux(uy j, uy k) {
   public static final Codec<ux> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(uy.a.fieldOf("chat").forGetter(ux::a), uy.a.fieldOf("narration").forGetter(ux::b)).apply($$0, ux::new)
   );
   public static final uy b = uy.a("chat.type.text");
   public static final ags<ux> c = a("chat");
   public static final ags<ux> d = a("say_command");
   public static final ags<ux> e = a("msg_command_incoming");
   public static final ags<ux> f = a("msg_command_outgoing");
   public static final ags<ux> g = a("team_msg_command_incoming");
   public static final ags<ux> h = a("team_msg_command_outgoing");
   public static final ags<ux> i = a("emote_command");

   private static ags<ux> a(String $$0) {
      return ags.a(kc.at, new agt($$0));
   }

   public static void a(pa<ux> $$0) {
      $$0.a(c, new ux(b, uy.a("chat.type.text.narrate")));
      $$0.a(d, new ux(uy.a("chat.type.announcement"), uy.a("chat.type.text.narrate")));
      $$0.a(e, new ux(uy.b("commands.message.display.incoming"), uy.a("chat.type.text.narrate")));
      $$0.a(f, new ux(uy.c("commands.message.display.outgoing"), uy.a("chat.type.text.narrate")));
      $$0.a(g, new ux(uy.d("chat.type.team.text"), uy.a("chat.type.text.narrate")));
      $$0.a(h, new ux(uy.d("chat.type.team.sent"), uy.a("chat.type.text.narrate")));
      $$0.a(i, new ux(uy.a("chat.type.emote"), uy.a("chat.type.emote")));
   }

   public static ux.a a(ags<ux> $$0, blf $$1) {
      return a($$0, $$1.dM().I_(), $$1.Q_());
   }

   public static ux.a a(ags<ux> $$0, ds $$1) {
      return a($$0, $$1.v(), $$1.b());
   }

   public static ux.a a(ags<ux> $$0, is $$1, vb $$2) {
      ir<ux> $$3 = $$1.d(kc.at);
      return $$3.e($$0).a($$2);
   }

   public ux.a a(vb $$0) {
      return new ux.a(this, $$0);
   }

   public uy a() {
      return this.j;
   }

   public uy b() {
      return this.k;
   }

   public static record a(ux a, vb b, @Nullable vb c) {
      a(ux $$0, vb $$1) {
         this($$0, $$1, null);
      }

      public vb a(vb $$0) {
         return this.a.a().a($$0, this);
      }

      public vb b(vb $$0) {
         return this.a.b().a($$0, this);
      }

      public ux.a c(vb $$0) {
         return new ux.a(this.a, this.b, $$0);
      }

      public ux.b a(is $$0) {
         ir<ux> $$1 = $$0.d(kc.at);
         return new ux.b($$1.a(this.a), this.b, this.c);
      }
   }

   public static record b(int a, vb b, @Nullable vb c) {
      public b(ue $$0) {
         this($$0.n(), $$0.m(), $$0.c(ue::m));
      }

      public void a(ue $$0) {
         $$0.c(this.a);
         $$0.a(this.b);
         $$0.a(this.c, ue::a);
      }

      public Optional<ux.a> a(is $$0) {
         ir<ux> $$1 = $$0.d(kc.at);
         ux $$2 = $$1.a(this.a);
         return Optional.ofNullable($$2).map($$0x -> new ux.a($$0x, this.b, this.c));
      }
   }
}
