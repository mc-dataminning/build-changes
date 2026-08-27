import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record uz(va j, va k) {
   public static final Codec<uz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(va.a.fieldOf("chat").forGetter(uz::a), va.a.fieldOf("narration").forGetter(uz::b)).apply($$0, uz::new)
   );
   public static final va b = va.a("chat.type.text");
   public static final ahc<uz> c = a("chat");
   public static final ahc<uz> d = a("say_command");
   public static final ahc<uz> e = a("msg_command_incoming");
   public static final ahc<uz> f = a("msg_command_outgoing");
   public static final ahc<uz> g = a("team_msg_command_incoming");
   public static final ahc<uz> h = a("team_msg_command_outgoing");
   public static final ahc<uz> i = a("emote_command");

   private static ahc<uz> a(String $$0) {
      return ahc.a(ke.au, new ahd($$0));
   }

   public static void a(pc<uz> $$0) {
      $$0.a(c, new uz(b, va.a("chat.type.text.narrate")));
      $$0.a(d, new uz(va.a("chat.type.announcement"), va.a("chat.type.text.narrate")));
      $$0.a(e, new uz(va.b("commands.message.display.incoming"), va.a("chat.type.text.narrate")));
      $$0.a(f, new uz(va.c("commands.message.display.outgoing"), va.a("chat.type.text.narrate")));
      $$0.a(g, new uz(va.d("chat.type.team.text"), va.a("chat.type.text.narrate")));
      $$0.a(h, new uz(va.d("chat.type.team.sent"), va.a("chat.type.text.narrate")));
      $$0.a(i, new uz(va.a("chat.type.emote"), va.a("chat.type.emote")));
   }

   public static uz.a a(ahc<uz> $$0, blp $$1) {
      return a($$0, $$1.dM().I_(), $$1.Q_());
   }

   public static uz.a a(ahc<uz> $$0, ds $$1) {
      return a($$0, $$1.v(), $$1.b());
   }

   public static uz.a a(ahc<uz> $$0, iu $$1, vd $$2) {
      it<uz> $$3 = $$1.d(ke.au);
      return $$3.e($$0).a($$2);
   }

   public uz.a a(vd $$0) {
      return new uz.a(this, $$0);
   }

   public va a() {
      return this.j;
   }

   public va b() {
      return this.k;
   }

   public static record a(uz a, vd b, @Nullable vd c) {
      a(uz $$0, vd $$1) {
         this($$0, $$1, null);
      }

      public vd a(vd $$0) {
         return this.a.a().a($$0, this);
      }

      public vd b(vd $$0) {
         return this.a.b().a($$0, this);
      }

      public uz.a c(vd $$0) {
         return new uz.a(this.a, this.b, $$0);
      }

      public uz.b a(iu $$0) {
         it<uz> $$1 = $$0.d(ke.au);
         return new uz.b($$1.a(this.a), this.b, this.c);
      }
   }

   public static record b(int a, vd b, @Nullable vd c) {
      public b(ug $$0) {
         this($$0.n(), $$0.m(), $$0.c(ug::m));
      }

      public void a(ug $$0) {
         $$0.c(this.a);
         $$0.a(this.b);
         $$0.a(this.c, ug::a);
      }

      public Optional<uz.a> a(iu $$0) {
         it<uz> $$1 = $$0.d(ke.au);
         uz $$2 = $$1.a(this.a);
         return Optional.ofNullable($$2).map($$0x -> new uz.a($$0x, this.b, this.c));
      }
   }
}
